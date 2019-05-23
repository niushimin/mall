package com.mall4j.springboot.service.mallregion.impl;

import com.mall4j.springboot.mapper.mallregion.MallRegionMapper;
import com.mall4j.springboot.pojo.mallregion.MallRegionProvince;
import com.mall4j.springboot.service.mallregion.MallRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 22:01
 * @Description:
 */

@Service
public class MallRegionServiceImpl implements MallRegionService {

    @Autowired
    MallRegionMapper mallRegionMapper;

    @Override
    public List<MallRegionProvince> queryMallRegionProvinceList() {
        List<MallRegionProvince> list = mallRegionMapper.queryMallRegionProvinceList();
        return list;
    }
}
