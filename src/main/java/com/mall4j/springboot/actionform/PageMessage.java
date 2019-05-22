package com.mall4j.springboot.actionform;

import java.util.ArrayList;

public class PageMessage<T> {
    ArrayList<T> items;
    Integer total;

    public ArrayList<T> getItems() {
        return items;
    }

    public void setItems(ArrayList<T> items) {
        this.items = items;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
