package com.example.kafkaconsumer3.repository;

import com.example.kafkaconsumer3.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<Users, Long> {
}
