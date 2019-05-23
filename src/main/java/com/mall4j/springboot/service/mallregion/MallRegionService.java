package com.mall4j.springboot.service.mallregion;

import com.mall4j.springboot.pojo.mallregion.MallRegionProvince;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 22:00
 * @Description:
 */

public interface MallRegionService {

    List<MallRegionProvince> queryMallRegionProvinceList();
}
