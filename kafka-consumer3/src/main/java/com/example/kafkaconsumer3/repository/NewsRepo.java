package com.example.kafkaconsumer3.repository;

import com.example.kafkaconsumer3.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepo extends CrudRepository<News, Long> {
}
