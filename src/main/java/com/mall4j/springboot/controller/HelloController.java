package com.mall4j.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 14:59
 * @Description:
 */

@Controller
public class HelloController {

    /**
     * 测试代码
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Spring Boot!";
    }

}
