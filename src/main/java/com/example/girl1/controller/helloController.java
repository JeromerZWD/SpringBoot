package com.example.girl1.controller;

import com.example.girl1.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
//    @Value("${cupSize}")
//    private String cupsize;
//    @Value("${age}")
//    private Integer age;
//    @Value("${content}")
//    private String content;
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping("/hello")
    public String hello(){
        System.out.println(girlProperties.getCupSize());
        System.out.println(girlProperties.getAge());
        return girlProperties.getCupSize();
    }
}
