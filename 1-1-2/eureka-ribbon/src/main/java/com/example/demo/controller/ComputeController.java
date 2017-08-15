package com.example.demo.controller;

import com.example.demo.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/8/14.
 */
@RestController
public class ComputeController {


   /* @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String add(){
        return restTemplate.getForEntity("http://compute-service/add?a=20&b=30",String.class).getBody();
    }*/

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value="/add",method= RequestMethod.GET)
    public String add(){

        return computeService.addService();

    }

}
