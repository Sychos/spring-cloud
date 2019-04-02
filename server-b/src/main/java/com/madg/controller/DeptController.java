package com.madg.controller;

import com.madg.entity.Dept;
import com.madg.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class DeptController
{
    @Autowired
    private DeptService deptService;

    @Value("server.port")
    private String port;

    @GetMapping("/{id}")
    public Dept getUserById(@PathVariable("id") Integer id)
    {
        System.out.println("访问的ServicePort="+port);
        return deptService.selectByPrimaryKey(id);
    }
}
