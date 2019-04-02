package com.madg.controller;

import com.madg.entity.Emp;
import com.madg.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController
{
    @Autowired
    private EmpService empService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/{id}")
    public Emp getEmpById(@PathVariable("id") int id)
    {
        System.out.println(port);
        return empService.selectByPrimaryKey(id);
    }
}
