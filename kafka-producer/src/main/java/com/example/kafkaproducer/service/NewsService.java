package com.example.kafkaproducer.service;

import com.example.kafkaproducer.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final KafkaTemplate<String, NewsDto> kafkaTemplate;

    public void sendMessage(String  to, NewsDto news) {
        kafkaTemplate.send(to,news);
    }
}
