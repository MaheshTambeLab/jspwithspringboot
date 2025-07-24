package com.example.fabjsptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FabjsptestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FabjsptestApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FabjsptestApplication.class);
    }


}