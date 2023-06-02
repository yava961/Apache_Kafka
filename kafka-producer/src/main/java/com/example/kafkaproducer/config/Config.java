package com.example.kafkaproducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class Config {

    @Bean
    public NewTopic news(){
        return TopicBuilder.name("news").build();
    }

    @Bean
    public NewTopic users(){
        return TopicBuilder.name("users").build();
    }
}
