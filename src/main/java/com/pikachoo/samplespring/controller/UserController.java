package com.pikachoo.samplespring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserController {

    @GetMapping("/")
    public String sayHello() {
        return "<h1>Hello world</h1>";
    }

    @GetMapping("/test")
    public String sayTest() {
        return "Testing";
    }

}
