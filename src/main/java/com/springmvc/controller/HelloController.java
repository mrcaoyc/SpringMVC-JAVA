package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author CaoYongCheng
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Map map){
        map.put("message","Hello SpringMVC");
        return "hello";
    }
}
