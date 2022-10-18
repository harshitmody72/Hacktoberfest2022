import { Task } from "../../tasks/entities/task.entity";
import { Column, Entity, OneToMany, PrimaryGeneratedColumn } from "typeorm";


@Entity()
export class User {
    @PrimaryGeneratedColumn("uuid")
    id: string;

    @Column({unique: true})
    username: string;

    @Column()
    password: string

    @Column()
    createdAt: Date

    @OneToMany(_type => Task, task => task.user, {eager: true})
    task: Task[]
}