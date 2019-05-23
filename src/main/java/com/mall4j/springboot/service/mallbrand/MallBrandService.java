package com.mall4j.springboot.service.mallbrand;

import com.mall4j.springboot.pojo.mallbrand.BrandPageVo;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 14:21
 * @Description:
 */
public interface MallBrandService {

    Map<String, Object> queryMallBrandPageList(BrandPageVo requestPageVo);
}
