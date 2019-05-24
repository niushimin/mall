package com.mall4j.springboot.controller.mallbrand;

import com.mall4j.springboot.pojo.mallbrand.BrandPageVo;
import com.mall4j.springboot.pojo.common.ResponseVo;
import com.mall4j.springboot.service.mallbrand.MallBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 14:20
 * @Description:
 */

@RestController
@RequestMapping("/brand")
public class MallBrandController {

    @Autowired
    MallBrandService mallBrandService;

    @RequestMapping("/list")
    public ResponseVo list(BrandPageVo requestPageVo) {
        Map<String, Object> data = mallBrandService.queryMallBrandPageList(requestPageVo);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }
}
