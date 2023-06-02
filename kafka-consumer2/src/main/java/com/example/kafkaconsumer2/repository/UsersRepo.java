package com.example.kafkaconsumer2.repository;

import com.example.kafkaconsumer2.entity.Users;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<Users,Long> {
}
