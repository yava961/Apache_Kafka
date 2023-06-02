package com.example.kafkaconsumer1.repository;

import com.example.kafkaconsumer1.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<Users, Long> {
}
