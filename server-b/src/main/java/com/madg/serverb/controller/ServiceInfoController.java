package com.madg.serverb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInfoController
{
    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public String getServiceNameAndPort(@RequestParam("name")String name)
    {
        System.out.println("正在调用当前服务："+port);
        return "Hello "+name+" servicePort "+port;
    }
}
