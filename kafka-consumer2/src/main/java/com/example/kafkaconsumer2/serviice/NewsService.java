package com.example.kafkaconsumer2.serviice;

import com.example.kafkaconsumer2.dto.NewsDto;

public interface NewsService {

    void saveTitle (NewsDto newsDto);
}
