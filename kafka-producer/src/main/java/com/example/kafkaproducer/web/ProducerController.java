package com.example.kafkaproducer.web;

import com.example.kafkaproducer.dto.NewsDto;
import com.example.kafkaproducer.dto.UsersDto;
import com.example.kafkaproducer.service.NewsService;
import com.example.kafkaproducer.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/producer")
public class ProducerController {

    private final UsersService userService;
    private final NewsService newsService;

    @PostMapping("/users")
    public void sendMessageToUser(@RequestParam String topic, @RequestBody UsersDto users){
        userService.sendMessage(topic, users);
    }

    @PostMapping("/news")
    public void sendMessageToNews(@RequestParam String topic, @RequestBody NewsDto news){
        newsService.sendMessage(topic, news);
    }
}
