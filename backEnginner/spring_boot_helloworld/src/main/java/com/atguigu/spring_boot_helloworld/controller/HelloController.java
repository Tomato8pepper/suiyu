package com.atguigu.spring_boot_helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello () {
        return "Hello world!";
    }
    @RequestMapping("/login")
    public String login () {
        return "{username: xiaoli, password: 123455}";
    }
}
