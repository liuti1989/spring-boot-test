package com.xkit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ordelApplication {
    public static void main(String[] ages){
        SpringApplication.run(ordelApplication.class,ages);
    }
 }
