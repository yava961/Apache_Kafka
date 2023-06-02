package com.example.kafkaconsumer2.serviice.impl;

import com.example.kafkaconsumer2.dto.NewsDto;
import com.example.kafkaconsumer2.entity.News;
import com.example.kafkaconsumer2.repository.NewsRepo;
import com.example.kafkaconsumer2.serviice.NewsService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepo newsRepo;
    private final ModelMapper modelMapper;

    @KafkaListener(topics = "news", groupId = "2")
    public void saveTitle(NewsDto newsDto) {
        newsRepo.save(modelMapper.map(newsDto, News.class));
    }
}
