package com.example.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequestMapping
public class HelloWorld {
    @Value("${shop.url}")
    private String url;

    @Value("${shop.username}")
    private String userName;

    @Value("${shop.password}")
    private String passWord;

    @ResponseBody
    @RequestMapping("/hello")
    public String test() {
        return "url:" + url + ", userName:" + userName + ", passWord:" +  passWord;
    }
}


