package com.xkit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order/getUserOrderById/{oid}")
    public String queryOrderUserById(@PathVariable String oid){
        return "{id:1,'name':'zhangsan','address':'湖南桃江'}";
    }
    @GetMapping(value = "/user")
    public String getName(){
        return "zs";
    }
}
