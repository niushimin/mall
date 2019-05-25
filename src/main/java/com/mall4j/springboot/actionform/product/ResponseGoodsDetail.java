package com.mall4j.springboot.actionform.product;

import com.mall4j.springboot.pojo.mallcategory.MallCategory;

import java.util.List;

public class ResponseGoodsDetail extends RequestGoods{
    List<Integer> categoryIds;

    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }
}
