package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

}
