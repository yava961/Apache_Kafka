package com.example.kafkaconsumer3.service;

import com.example.kafkaconsumer3.dto.NewsDto;

public interface NewsService {

    void saveTitle (NewsDto newsDto);
}
