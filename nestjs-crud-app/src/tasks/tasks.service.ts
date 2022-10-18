/*
https://docs.nestjs.com/providers#services
*/

import { Injectable, NotFoundException } from '@nestjs/common';
import { TaskStatus } from './tasks-status.enum';
import { CreateTaskDto } from './dto/create-task.dto';
import { GetTasksFilterDto } from './dto/get-tasks-filter.dto';
import { InjectRepository } from '@nestjs/typeorm';
import { Task } from './entities/task.entity';
import { Repository } from 'typeorm';
import { User } from '../auth/entities/user.entity';

@Injectable()
export class TasksService {
    constructor(
        @InjectRepository(Task)
        private taskRepository: Repository<Task>,
    ){}

    getAllTasks(): Promise<Task[]>{
        return this.taskRepository.find();
    } 

    async getTasks(filteredDto: GetTasksFilterDto, user: User):  Promise<Task[]> {
        const {status, search} = filteredDto;
        const query = this.taskRepository.createQueryBuilder('task');
        query.andWhere({user})
        if (status) {
            // tasks =  tasks.filter((task) => task.status === status.toUpperCase())
            query.andWhere('task.status = :status',  // :status is variable can be named anything but that same name to be used in object key (e.g :variable {variable: "Test Example"})
            {status : status});
        }

        if (search) {
            query.andWhere('(LOWER(task.title) LIKE LOWER(:search) OR LOWER(task.description) LIKE LOWER(:search))', 
            { search: `%${search}%` });
        }
        const tasks = await query.getMany();
        return tasks;
    }

    async createTask(createTaskDto: CreateTaskDto, user: User): Promise<Task> {
        const {title, description} = createTaskDto;
        const task = this.taskRepository.create({
            title,
            description,
            status: TaskStatus.OPEN,
            user
        })
        await this.taskRepository.save(task)
        return task;
    }

    async getTaskById(id: string, user: User): Promise<Task> {
        const task = await this.taskRepository.findOneBy({id, user})

        if(!task){
            throw new NotFoundException(`Task with ID ${id} not found`)
        }
        return task
    }

    async deleteTaskById(id: string, user: User): Promise<void> {
        const result = await this.taskRepository.delete({id,user});
        if(result.affected === 0) throw new NotFoundException(`Task with ID ${id} not found`)
    }

    async  updateStatusById(id: string, status: TaskStatus): Promise<void> {
        const result = await this.taskRepository.update(id,{status})
        if(result.affected === 0) throw new NotFoundException(`Task with ID ${id} not found`)
    }

 }
