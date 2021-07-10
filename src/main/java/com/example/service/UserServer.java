package com.example.service;

import com.example.dao.UserDao;
import com.example.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@RequestMapping("user")
public class UserServer {
    @Autowired
    private UserDao userMapper;
    @ResponseBody
    @RequestMapping("getuser/{id}")
    public String test(@PathVariable int id) {
        MyUser user = userMapper.selectUserById(id);
        System.out.println(user.toString());
        return user.toString();
    }
}