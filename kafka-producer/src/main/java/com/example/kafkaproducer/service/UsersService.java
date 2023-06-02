package com.example.kafkaproducer.service;

import com.example.kafkaproducer.dto.UsersDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

    private final KafkaTemplate<String, UsersDto> kafkaTemplate;

    public void sendMessage(String topic, UsersDto users){
        kafkaTemplate.send(topic, users);
    }


}
