package com.zhaostudy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka8763Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka8763Application.class, args);
    }
}
