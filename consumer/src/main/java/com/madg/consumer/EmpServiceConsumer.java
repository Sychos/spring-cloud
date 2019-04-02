package com.madg.consumer;

import com.madg.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmpServiceConsumer
{
    @Autowired
    RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate rest()
    {
        return new RestTemplate();
    }


    @GetMapping("/gotoEmp/{id}")
    public Emp getBanlancedEmp(@PathVariable("id") Integer id)
    {
        Emp emp=restTemplate.getForObject("http://cloud-service/emp/"+id,Emp.class);
        return emp;
    }
}
