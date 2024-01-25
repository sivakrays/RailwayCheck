package com.spring.railwayCheck.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class DemoController {

    @GetMapping("/railway")
    public String get(){
        return "Rail way working";
    }
}
