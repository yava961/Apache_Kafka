package com.example.kafkaconsumer2.serviice.impl;

import com.example.kafkaconsumer2.dto.UsersDto;
import com.example.kafkaconsumer2.entity.Users;
import com.example.kafkaconsumer2.repository.UsersRepo;
import com.example.kafkaconsumer2.serviice.UsersService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepo usersRepo;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "users", groupId = "2")
    public void saveUsersName(UsersDto usersDto) {
        usersRepo.save(modelMapper.map(usersDto, Users.class));
    }
}
