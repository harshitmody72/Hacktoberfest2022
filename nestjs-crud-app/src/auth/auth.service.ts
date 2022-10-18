import { JwtPayload } from './interfaces/jwt-payload.interface';
import { ConflictException, Injectable, InternalServerErrorException, NotFoundException, UnauthorizedException } from '@nestjs/common';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { AuthCredentialsDto } from './dto/auth-credentials.dto';
import { User } from './entities/user.entity';
import * as bcrypt from 'bcrypt'
import { JwtService } from '@nestjs/jwt';

@Injectable()
export class AuthService {
    constructor(
        @InjectRepository(User)
        private userRepository: Repository<User>,
        private jwtService : JwtService,
    ){}

    async createUser(authCredentialsDto: AuthCredentialsDto): Promise<void> {
        try {
            const {username , password} = authCredentialsDto;
            
            // Hash
            const salt = await bcrypt.genSalt();
            const hashedPassword = await bcrypt.hash(password,salt);

            const user = this.userRepository.create({
                username,
                password: hashedPassword,
                createdAt: new Date()
            })
            await this.userRepository.save(user)
        } catch (error) {
            if(error.errno === 1062) {
                throw new ConflictException('Username already exists')
            }else {
                throw new InternalServerErrorException();
            }
        }
    }

    async getUser(authCredentialsDto: AuthCredentialsDto): Promise<{accessToken: string}> {
        const {username , password} = authCredentialsDto;
        
        const user = await this.userRepository.findOneBy({username})
        if(user && (await bcrypt.compare(password, user.password))){
            const payload: JwtPayload  = {username};
            const accessToken: string = await this.jwtService.sign(payload)
            return {accessToken}
        }else {
            throw new UnauthorizedException(`Please check your login credentials`)
        }
    }
}
