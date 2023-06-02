package com.example.kafkaconsumer1.service;

import com.example.kafkaconsumer1.dto.NewsDto;

public interface NewsService {

    void saveTitle (NewsDto newsDto);
}
