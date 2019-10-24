package com.xkit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getUserOrderById/{uid}")
    public String getUserOrderById(@PathVariable String uid){
        String orderinfo = restTemplate.getForObject("http://localhost:8083/order/getUserOrderById/"+1,String.class);
        return orderinfo;
    }
}
