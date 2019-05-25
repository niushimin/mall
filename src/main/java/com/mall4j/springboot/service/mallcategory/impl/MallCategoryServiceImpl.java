package com.mall4j.springboot.service.mallcategory.impl;

import com.mall4j.springboot.mapper.mallcategory.MallCategoryMapper;
import com.mall4j.springboot.pojo.mallcategory.LabelVo;
import com.mall4j.springboot.pojo.mallcategory.MallCategory;
import com.mall4j.springboot.pojo.mallcategory.MallCategoryPrimary;
import com.mall4j.springboot.pojo.mallcategory.MallCategorySecond;
import com.mall4j.springboot.service.mallcategory.MallCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Random;

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
    public List<LabelVo> queryMallCategoryLabelList() {
        List<LabelVo> list = mallCategoryMapper.queryMallCategoryLabelList();
        return list;
    }

    @Override
    public MallCategory createNewMallCategory(MallCategory mallCategory) {
        Date date = new Date();
        mallCategory.setAddTime(date);
        mallCategory.setUpdateTime(date);
        mallCategory.setDeleted(false);
        mallCategory.setSortOrder((byte) new Random().nextInt(100));
        mallCategoryMapper.createNewMallCategory(mallCategory);
        MallCategory category = mallCategoryMapper.selectByPrimaryKey(mallCategory.getId());
        return category;
    }

    @Override
    public void updateMallCategory(MallCategory mallCategory) {
        mallCategoryMapper.updateByPrimaryKeySelective(mallCategory);
    }

    @Override
    public void deleteMallCategoryByPrimary(MallCategoryPrimary mallCategoryPrimary) {
        mallCategoryMapper.deleteMallCategorySecond(mallCategoryPrimary.getId());
        mallCategoryMapper.deleteMallCategoryPrimary(mallCategoryPrimary.getId());
    }


}
