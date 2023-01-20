package com.utoppia.education;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpockTddApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpockTddApplication.class, args);
    }
}
