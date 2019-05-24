package com.mall4j.springboot.actionform.product;

import java.util.List;

public class ReponseCategory extends ReponseClass{
    List<ReponseClass> children;

    public ReponseCategory() {
    }

    public ReponseCategory(String label, int value, List<ReponseClass> children) {
        super(label, value);
        this.children = children;
    }

    public List<ReponseClass> getChildren() {
        return children;
    }

    public void setChildren(List<ReponseClass> children) {
        this.children = children;
    }
}
