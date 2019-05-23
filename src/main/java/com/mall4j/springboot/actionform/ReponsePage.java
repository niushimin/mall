package com.mall4j.springboot.actionform;

import java.util.ArrayList;
import java.util.List;

public class ReponsePage<T> {
    List<T> items;
    long total;

    public ReponsePage() {
    }

    public ReponsePage(List<T> items, long total) {
        this.items = items;
        this.total = total;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
