package com.nantian.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping("user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map map, HttpSession session) {
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            //登录成功。防止表单重复提交，可以重定向到主页
            session.setAttribute("user",username);
            return "redirect:/main.html";
        }else{
            //登录失败
            map.put("msg","用户名密码错误，请重新登录！");
            return "login";
        }
    }

}
