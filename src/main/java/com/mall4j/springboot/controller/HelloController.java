package com.mall4j.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

}
