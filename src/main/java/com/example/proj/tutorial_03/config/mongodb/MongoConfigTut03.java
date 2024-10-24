// Todo : Use this if you use tut03 as for another new project since @Bean already created no need here mongoTemplate

//package com.example.proj.tutorial_03.config.mongodb;
//
//import com.mongodb.client.MongoClients;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//@Configuration
//public class MongoConfigTut03 {
//
//    @Value("${spring.data.mongodb.uri}")
//    private String monogUri;
//
//    @Value("${spring.data.mongodb.database}")
//    private String mongoDb;
//
//    @Bean
//    public MongoTemplate mongoTemplate(){
//        return new MongoTemplate(MongoClients.create(monogUri),mongoDb);
//    }
//}
