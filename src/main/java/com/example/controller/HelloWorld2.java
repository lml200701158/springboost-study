package com.example.controller;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
@RequestMapping
@Setter
@ConfigurationProperties(prefix = "shop")
public class HelloWorld2 {
    private String url;
    private String username;
    private String password;

    @ResponseBody
    @RequestMapping("/hello2")
    public String test() {
        return "url:" + url + ", username:" + username + ", password:" +  password;
    }
}


