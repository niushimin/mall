package com.mall4j.springboot.actionform.product;

import com.mall4j.springboot.pojo.MallGoods;
import com.mall4j.springboot.pojo.MallGoodsAttribute;
import com.mall4j.springboot.pojo.MallGoodsProduct;
import com.mall4j.springboot.pojo.MallGoodsSpecification;

import java.util.List;

public class RequestGoods {
    List<MallGoodsAttribute> attributes;
    MallGoods goods;
    List<MallGoodsProduct> products;
    List<MallGoodsSpecification> specifications;

    public List<MallGoodsAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<MallGoodsAttribute> attributes) {
        this.attributes = attributes;
    }

    public MallGoods getGoods() {
        return goods;
    }

    public void setGoods(MallGoods goods) {
        this.goods = goods;
    }

    public List<MallGoodsProduct> getProducts() {
        return products;
    }

    public void setProducts(List<MallGoodsProduct> products) {
        this.products = products;
    }

    public List<MallGoodsSpecification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<MallGoodsSpecification> specifications) {
        this.specifications = specifications;
    }
}
