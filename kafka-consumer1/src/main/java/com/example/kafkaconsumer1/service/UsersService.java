package com.example.kafkaconsumer1.service;

import com.example.kafkaconsumer1.dto.UsersDto;

public interface UsersService {

    void saveUsersName(UsersDto usersDto);
}
