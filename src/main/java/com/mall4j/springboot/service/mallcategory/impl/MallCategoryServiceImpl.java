package com.mall4j.springboot.service.mallcategory.impl;

import com.mall4j.springboot.mapper.mallcategory.MallCategoryMapper;
import com.mall4j.springboot.pojo.mallcategory.MallCategoryPrimary;
import com.mall4j.springboot.pojo.mallcategory.MallCategorySecond;
import com.mall4j.springboot.service.mallcategory.MallCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 17:53
 * @Description:
 */

@Service
public class MallCategoryServiceImpl implements MallCategoryService {

    @Autowired
    MallCategoryMapper mallCategoryMapper;

    @Override
    public List<MallCategoryPrimary> queryMallCategoryList() {
        List<MallCategoryPrimary> list = mallCategoryMapper.queryMallCategoryList();
        return list;
    }

    @Override
    public void deleteMallCategoryByPrimary(MallCategoryPrimary mallCategoryPrimary) {
        mallCategoryMapper.deleteMallCategorySecond(mallCategoryPrimary.getId());
        mallCategoryMapper.deleteMallCategoryPrimary(mallCategoryPrimary.getId());
    }
}
