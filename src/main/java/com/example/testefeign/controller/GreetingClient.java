package com.example.testefeign.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("teste-eureke-client")
public interface GreetingClient {
    @RequestMapping("/greeting")
    String greeting();
}
