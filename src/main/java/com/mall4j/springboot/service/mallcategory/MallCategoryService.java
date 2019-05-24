package com.mall4j.springboot.service.mallcategory;

import com.mall4j.springboot.pojo.mallcategory.LabelVo;
import com.mall4j.springboot.pojo.mallcategory.MallCategory;
import com.mall4j.springboot.pojo.mallcategory.MallCategoryPrimary;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 17:52
 * @Description:
 */

public interface MallCategoryService {

    List<MallCategoryPrimary> queryMallCategoryList();

    List<LabelVo> queryMallCategoryLabelList();

    MallCategory createNewMallCategory(MallCategory mallCategory);

    void updateMallCategory(MallCategory mallCategory);

    void deleteMallCategoryByPrimary(MallCategoryPrimary mallCategoryPrimary);

}
