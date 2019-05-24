package com.mall4j.springboot.actionform.product;

public class ReponseClass {
    String label;
    int value;

    public ReponseClass() {
    }

    public ReponseClass(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
