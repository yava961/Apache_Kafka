package com.example.kafkaconsumer2.serviice;

import com.example.kafkaconsumer2.dto.UsersDto;

public interface UsersService {

    void saveUsersName(UsersDto usersDto);

}
