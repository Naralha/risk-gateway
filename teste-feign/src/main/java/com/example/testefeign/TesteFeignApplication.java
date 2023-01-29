package com.example.testefeign;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TesteFeignApplication {

    public static void main(String[] args) {

        SpringApplication.run(TesteFeignApplication.class, args);
    }

}
