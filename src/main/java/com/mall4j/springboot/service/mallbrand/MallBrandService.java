package com.mall4j.springboot.service.mallbrand;

import com.mall4j.springboot.pojo.mallbrand.BrandPageVo;
import com.mall4j.springboot.pojo.mallbrand.MallBrand;
import com.mall4j.springboot.pojo.mallbrand.MallBrandVo;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 14:21
 * @Description:
 */
public interface MallBrandService {

    Map<String, Object> queryMallBrandPageList(BrandPageVo requestPageVo);

    MallBrandVo createNewMallBrand(MallBrand mallBrand);

    MallBrand updateMallBrand(MallBrand mallBrand);

    void deleteMallBrand(MallBrand mallBrand);
}
