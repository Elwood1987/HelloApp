package com.helloapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        System.out.println("Hi" + name);
        return "Hola " + name + ", es un gusto saludarte";
    }
}
