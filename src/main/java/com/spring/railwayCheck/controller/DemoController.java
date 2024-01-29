package com.spring.railwayCheck.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class DemoController {

@Autowired
DemoRepository repository;

    @GetMapping("/railway")
    public String get(){
        return "Rail way working";
    }

    @PostMapping("/saveRailway")
    public Railway save(@RequestBody Railway railway){
 return repository.save(railway);
    }
}
