package com.huimiyun.platform.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@RequestMapping("/user")
public class userController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "哈哈哈哈";
    }
}
