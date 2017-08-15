package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lenovo on 2017/8/10.
 */
@RestController
public class ConsumerController {

     @Autowired
     RestTemplate restTemplate;

   @RequestMapping(value="/add",method = RequestMethod.GET)
   public String add(){
       return restTemplate.getForEntity("http://compute-service/add?a=20&b=30",String.class).getBody();
   }
}
