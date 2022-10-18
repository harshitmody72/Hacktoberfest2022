import { Exclude } from "class-transformer";
import { User } from "../../auth/entities/user.entity";
import { Column, Entity, ManyToOne, PrimaryGeneratedColumn } from "typeorm";
import { TaskStatus } from "../tasks-status.enum";

@Entity()
export class Task {
    @PrimaryGeneratedColumn("uuid")
    id: string;

    @Column()
    title: string;

    @Column()
    description: string;

    @Column({default: TaskStatus.OPEN})
    status: TaskStatus;

    @ManyToOne(_type => User, user => user.task, {eager: false})
    @Exclude({toPlainOnly: true})
    user: User
}