package com.madg.server.controller;

import com.madg.server.entity.User;
import com.madg.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @Value("server.port")
    private String port;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id)
    {
        System.out.println("访问的ServicePort="+port);
        return userService.selectByPrimaryKey(id);
    }
}
