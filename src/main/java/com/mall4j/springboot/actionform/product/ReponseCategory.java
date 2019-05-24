package com.mall4j.springboot.actionform.product;

import java.util.List;

public class ReponseCategory extends ReponseBrand {
    List<ReponseBrand> children;

    public ReponseCategory() {
    }

    public ReponseCategory(String label, int value, List<ReponseBrand> children) {
        super(label, value);
        this.children = children;
    }

    public List<ReponseBrand> getChildren() {
        return children;
    }

    public void setChildren(List<ReponseBrand> children) {
        this.children = children;
    }
}
