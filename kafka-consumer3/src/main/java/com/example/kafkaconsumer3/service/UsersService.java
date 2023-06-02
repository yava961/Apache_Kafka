package com.example.kafkaconsumer3.service;

import com.example.kafkaconsumer3.dto.UsersDto;

public interface UsersService {

    void saveUsersName(UsersDto usersDto);
}
