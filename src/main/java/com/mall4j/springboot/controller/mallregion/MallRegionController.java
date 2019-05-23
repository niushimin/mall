package com.mall4j.springboot.controller.mallregion;

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
        List<MallRegionProvince> data =  mallRegionService.queryMallRegionProvinceList();
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }
}
