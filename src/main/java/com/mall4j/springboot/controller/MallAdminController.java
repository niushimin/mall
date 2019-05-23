package com.mall4j.springboot.controller;

import com.mall4j.springboot.pojo.MallAdmin;
import com.mall4j.springboot.pojo.MallAdminVo;
import com.mall4j.springboot.service.mallregion.MallAdminService;
import com.mall4j.springboot.utils.UUIDUitls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 19:02
 * @Description:
 */

@RestController
@RequestMapping("/auth")
public class MallAdminController {

    @Autowired
    MallAdminService mallAdminService;
    Map<String, MallAdmin> admin;

    @RequestMapping("/login")
    public Map<String, Object> login(@RequestBody MallAdminVo mallAdminVo) {
        boolean flag = mallAdminService.login(mallAdminVo);
        Map<String, Object> map = new HashMap<>();
        if (flag) {
            map.put("data", UUIDUitls.getUUID());
            map.put("errmsg", "成功");
            map.put("errno", 0);
        }
        return map;
    }

    @RequestMapping("/info")
    public Map<String, Object> info(String token) {
        Map<String, Object> data = new HashMap<>();
        data.put("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        data.put("name", "admin123");
        List<String> perms = new ArrayList<>();
        perms.add("*");
        data.put("perms", perms);
        List<String> roles = new ArrayList<>();
        roles.add("超级管理员");
        data.put("roles", roles);
        Map<String, Object> map = new HashMap<>();
        map.put("data", data);
        map.put("errmsg", "成功");
        map.put("errno", 0);
        return map;
    }
}
