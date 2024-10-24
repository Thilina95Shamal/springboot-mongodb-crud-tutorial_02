package com.example.proj.tutorial_02.configuration.mongodb;

import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

// This is for configuring the MongoOperation for the need of Auto-Increments in Models

@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;

    @Value("${spring.data.mongodb.database}")
    private String mongoDBName;

    @Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(MongoClients.create(mongoUri), mongoDBName);
    }
}
