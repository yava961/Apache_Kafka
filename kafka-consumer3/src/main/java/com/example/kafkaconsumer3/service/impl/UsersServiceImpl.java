package com.example.kafkaconsumer3.service.impl;

import com.example.kafkaconsumer3.dto.UsersDto;
import com.example.kafkaconsumer3.entity.Users;
import com.example.kafkaconsumer3.repository.UsersRepo;
import com.example.kafkaconsumer3.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepo usersRepo;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "users", groupId = "3")
    public void saveUsersName(UsersDto usersDto) {
        usersRepo.save(modelMapper.map(usersDto, Users.class));
    }
}
