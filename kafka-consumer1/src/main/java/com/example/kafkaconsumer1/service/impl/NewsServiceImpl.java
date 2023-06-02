package com.example.kafkaconsumer1.service.impl;

import com.example.kafkaconsumer1.dto.NewsDto;
import com.example.kafkaconsumer1.entity.News;
import com.example.kafkaconsumer1.repository.NewsRepo;
import com.example.kafkaconsumer1.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepo newsRepo;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "news", groupId = "1")
    public void saveTitle(NewsDto newsDto) {
        newsRepo.save(modelMapper.map(newsDto, News.class));
    }
}
