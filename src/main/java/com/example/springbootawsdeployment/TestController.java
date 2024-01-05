package com.example.springbootawsdeployment;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/demo")
public class TestController{
    @GetMapping("/data")
    public string getdata(){
        return "first message from AWS ECS";
    }
}
