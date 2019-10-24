package com.xkit.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//EnableEurekaServer是服务机

/**
 * 注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class eurekaServerApplication {
    public static void main(String[] ages){
        SpringApplication.run(eurekaServerApplication.class);
    }
}
