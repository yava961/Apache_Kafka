package com.example.kafkaconsumer1.service.impl;

import com.example.kafkaconsumer1.dto.UsersDto;
import com.example.kafkaconsumer1.entity.Users;
import com.example.kafkaconsumer1.repository.UsersRepo;
import com.example.kafkaconsumer1.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UsersService {

    private final UsersRepo usersRepo;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "users", groupId = "1")
    public void saveUsersName(UsersDto usersDto) {
        usersRepo.save(modelMapper.map(usersDto, Users.class));
    }
}

