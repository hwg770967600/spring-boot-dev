package com.bwol.springbootdemo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: hewengang
 * @Date: Created in 15:05 2019/4/1
 * @modificd by:
 */
@RestController("/")
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
