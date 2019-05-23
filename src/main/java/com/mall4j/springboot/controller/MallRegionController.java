package com.mall4j.springboot.controller;

import com.mall4j.springboot.pojo.common.ResponseVo;
import com.mall4j.springboot.pojo.mallregion.MallRegionProvince;
import com.mall4j.springboot.service.mallregion.MallRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 22:00
 * @Description:
 */

@RestController
@RequestMapping("/region")
public class MallRegionController {

    @Autowired
    MallRegionService mallRegionService;

    @RequestMapping("/list")
    public ResponseVo list() {
        long time1 = System.currentTimeMillis();
        List<MallRegionProvince> data =  mallRegionService.queryMallRegionProvinceList();
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
        ResponseVo responseVo = null;
        if (data != null) {
            responseVo = new ResponseVo(data, "成功", 0);
        } else {
            responseVo = new ResponseVo(null, "失败", 1);
        }
        return responseVo;
    }
}
