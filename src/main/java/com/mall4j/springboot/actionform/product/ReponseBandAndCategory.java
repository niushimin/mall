package com.mall4j.springboot.actionform.product;

import java.util.List;

public class ReponseBandAndCategory {
    List<ReponseBrand> brandList;
    List<ReponseCategory> categoryList;

    public ReponseBandAndCategory() {
    }

    public ReponseBandAndCategory(List<ReponseBrand> brandList, List<ReponseCategory> categoryList) {
        this.brandList = brandList;
        this.categoryList = categoryList;
    }

    public List<ReponseBrand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<ReponseBrand> brandList) {
        this.brandList = brandList;
    }

    public List<ReponseCategory> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<ReponseCategory> categoryList) {
        this.categoryList = categoryList;
    }
}
