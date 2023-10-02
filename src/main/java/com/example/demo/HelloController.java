package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/hello-bean")
    public HelloBean helloBean(){
        return new HelloBean("Hola Mundo bean");
    }

}
