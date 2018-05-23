package com.nantian.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    /* @GetMapping({"/","/index.html"})
     public String index(){
         return "index";
     }*/

    @GetMapping("success")
    public String success(Map map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lishi","wangwu"));
        return "success";
    }
}
