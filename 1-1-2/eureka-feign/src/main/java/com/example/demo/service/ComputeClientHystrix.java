package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by lenovo on 2017/8/14.
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    public Integer add(@RequestParam(value ="a") Integer a,@RequestParam(value = "b") Integer b){
        return -9999;
    }
}
