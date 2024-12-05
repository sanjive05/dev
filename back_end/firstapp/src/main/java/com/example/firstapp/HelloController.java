package com.example.firstapp;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!...";
    }
    @PostMapping("/hello")
    public Student helloPost(@RequestBody String name){
        return new Student("Hello "+name);
    }

}
