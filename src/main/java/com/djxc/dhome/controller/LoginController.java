package com.djxc.dhome.controller;

import com.djxc.dhome.entity.User;
import com.djxc.dhome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    public String index() {
        return "hello world";
    }

    @RequestMapping(value = "/select")
    public String login(){
        User users = userService.selectById(1);
        String result =  users.getName() + " -> " + users.getPassword() + " -> " + users.getEmail();
        return result;
    }
}
