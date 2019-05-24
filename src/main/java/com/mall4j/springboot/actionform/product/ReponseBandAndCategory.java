package com.mall4j.springboot.actionform.product;

import java.util.List;

public class ReponseBandAndCategory {
    List<ReponseClass> brandList;
    List<ReponseClass> categoryList;

    public ReponseBandAndCategory() {
    }

    public ReponseBandAndCategory(List<ReponseClass> brandList, List<ReponseClass> categoryList) {
        this.brandList = brandList;
        this.categoryList = categoryList;
    }

    public List<ReponseClass> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<ReponseClass> brandList) {
        this.brandList = brandList;
    }

    public List<ReponseClass> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<ReponseClass> categoryList) {
        this.categoryList = categoryList;
    }
}
