import { Repository } from 'typeorm';
import {Test} from '@nestjs/testing'
import { TasksService } from './tasks.service';
import { Task } from './entities/task.entity';
import { TasksController } from './tasks.controller';

const mockTasksRepository = () => ({
    getTasks : jest.fn()
});

describe('TaskService', () => {
    let taskService: TasksService;
    let taskRepository: Repository<Task>

    // beforeEach(async () => {
    //     const module = await Test.createTestingModule({
    //         providers: [TasksService,
    //         { provide: Repository<Task>, useFactory: mockTasksRepository}],
    //     }).compile();

    //     taskService = module.get(TasksService);
    //     taskRepository = module.get(Repository<Task>)
    // })

    let controller: TasksController

    beforeEach(async () => {
        const module = await Test.createTestingModule({
            controllers: [TasksController],
            providers: [TasksService],
        })
        .overrideProvider(TasksService)
        .useValue(mockTasksRepository)
        .compile();

        controller = module.get<TasksController>(TasksController)
    })

    describe("getTask", () => {
        it('should be defined', () => {
            expect(controller).toBeDefined();
        });

        it('should create a Task', () => {
             
        });
    })
});