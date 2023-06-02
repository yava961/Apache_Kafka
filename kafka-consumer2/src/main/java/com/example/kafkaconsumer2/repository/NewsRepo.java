package com.example.kafkaconsumer2.repository;

import com.example.kafkaconsumer2.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepo extends CrudRepository<News,Long> {
}
