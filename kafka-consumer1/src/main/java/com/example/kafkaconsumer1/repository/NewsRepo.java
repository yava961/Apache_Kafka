package com.example.kafkaconsumer1.repository;

import com.example.kafkaconsumer1.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepo extends CrudRepository<News,Long> {
}
