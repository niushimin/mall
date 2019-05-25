package com.mall4j.springboot.service.mallbrand.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.mapper.mallbrand.MallBrandMapper;
import com.mall4j.springboot.pojo.mallbrand.BrandPageVo;
import com.mall4j.springboot.pojo.mallbrand.MallBrand;
import com.mall4j.springboot.pojo.mallbrand.MallBrandVo;
import com.mall4j.springboot.pojo.mallissue.MallIssueVo;
import com.mall4j.springboot.service.mallbrand.MallBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Override
    public MallBrandVo createNewMallBrand(MallBrand mallBrand) {
        Date date = new Date();
        mallBrand.setAddTime(date);
        mallBrand.setUpdateTime(date);
        mallBrand.setSortOrder((byte) new Random().nextInt(100));
        mallBrand.setDeleted(false);
        mallBrandMapper.createNewMallBrand(mallBrand);
        Integer id = mallBrand.getId();
        MallBrandVo mallBrandVo = mallBrandMapper.selectMallBrandVoById(id);
        return mallBrandVo;
    }

    @Override
    public MallBrand updateMallBrand(MallBrand mallBrand) {
        mallBrandMapper.updateByPrimaryKeySelective(mallBrand);
        MallBrand brand = mallBrandMapper.selectByPrimaryKey(mallBrand.getId());
        return brand;
    }

    @Override
    public void deleteMallBrand(MallBrand mallBrand) {
        mallBrandMapper.deleteByPrimaryKey(mallBrand.getId());
    }
}
