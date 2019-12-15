package com.che.blogsys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: blogsys
 * @description: 登录Controller
 * @author: cgq
 * @create: 2019-12-15 20:27
 **/
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}