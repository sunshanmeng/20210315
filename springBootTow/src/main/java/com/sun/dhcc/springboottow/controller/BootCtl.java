package com.sun.dhcc.springboottow.controller;

import com.sun.dhcc.springboottow.redis.config.RedisConfig;
import com.sun.dhcc.springboottow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ssm
 * @date 2020/9/14 10:27
 */
@Controller
public class BootCtl {
    @Autowired
    UserService userService;

    @Resource
    RedisConfig redisConfig;
    @RequestMapping("/bootone")
    public String bootOne(){
        userService.getUser();
        String a = redisConfig.get("meke");
        System.out.println("------this line------"+a);
        return "index";
    }
}
