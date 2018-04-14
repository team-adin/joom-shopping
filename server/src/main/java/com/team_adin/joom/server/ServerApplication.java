package com.team_adin.joom.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ServerApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
