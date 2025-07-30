package com.forumhub;

spring.flyway.enabled=true
        spring.flyway.locations=classpath:db/migration

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForumHubApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForumHubApplication.class, args);
    }
}

