package com.madg.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController
{

    @Value("${spring.datasource.driver-class-name}")
    private String name;

    @GetMapping("/myname")
    public String getUserName()
    {
        return name;
    }
}