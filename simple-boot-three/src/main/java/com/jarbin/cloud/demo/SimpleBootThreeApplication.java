package com.jarbin.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimpleBootThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootThreeApplication.class, args);
    }
}
