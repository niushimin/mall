package com.mall4j.springboot.service.mallbrand.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.mapper.mallbrand.MallBrandMapper;
import com.mall4j.springboot.pojo.mallbrand.BrandPageVo;
import com.mall4j.springboot.pojo.mallbrand.MallBrand;
import com.mall4j.springboot.service.mallbrand.MallBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 14:21
 * @Description:
 */

@Service
public class MallBrandServiceImpl implements MallBrandService {

    @Autowired
    MallBrandMapper mallBrandMapper;

    @Override
    public Map<String, Object> queryMallBrandPageList(BrandPageVo requestPageVo) {
        PageHelper.startPage(requestPageVo.getPage(), requestPageVo.getLimit());
        List<MallBrand> list = mallBrandMapper.queryMallBrandPageList(requestPageVo);
        PageInfo page = new PageInfo(list);
        Map<String, Object> map = new HashMap<>(16);
        map.put("items", page.getList());
        map.put("total", page.getTotal());
        return map;
    }
}
