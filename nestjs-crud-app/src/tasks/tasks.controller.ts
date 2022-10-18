import { CreateTaskDto } from './dto/create-task.dto';
/*
https://docs.nestjs.com/controllers#controllers
*/

import { Controller, Get, Post, Body, Param, Delete, Query, Patch, UseGuards } from '@nestjs/common';
import { TaskStatus } from './tasks-status.enum';
import { TasksService } from './tasks.service';
import { GetTasksFilterDto } from './dto/get-tasks-filter.dto';
import { UpdateTaskStatusDto } from './dto/update-task.dto';
import { Task } from './entities/task.entity';
import {AuthGuard} from '@nestjs/passport'
import { GetUser } from '../auth/get-user.decorator';
import { User } from '../auth/entities/user.entity';

@Controller('tasks')
@UseGuards(AuthGuard())
export class TasksController {
    constructor(private tasksService: TasksService) {}

    @Get()
    getTasks(@GetUser() user: User, @Query() filteredDto: GetTasksFilterDto):  Promise<Task[]>  {
        return this.tasksService.getTasks(filteredDto,user)
    }

    @Post()
    createTask(
        @Body() createTaskDto: CreateTaskDto,
        @GetUser() user: User
    ):  Promise<Task> {
        return this.tasksService.createTask(createTaskDto, user);
    }

    @Get('/:id')
    getTaskById(@GetUser() user: User, @Param('id') id: string):  Promise<Task> {
        return this.tasksService.getTaskById(id,user);
    }

    @Delete('/:id')
    deleteTaskById(@GetUser() user: User,@Param('id') id: string):  Promise<void> {
        return this.tasksService.deleteTaskById(id,user);
    }

    @Patch('/:id/status')
    updateStatusById(@Param('id') id: string, @Body() updateTaskStatus: UpdateTaskStatusDto):  Promise<void> {
        const {status} = updateTaskStatus
        return this.tasksService.updateStatusById(id, status);
    }
}
