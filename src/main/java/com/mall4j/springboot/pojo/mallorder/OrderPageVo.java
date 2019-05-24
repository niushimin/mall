package com.mall4j.springboot.pojo.mallorder;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/24 14:58
 * @Description:
 */

public class OrderPageVo {
    private Integer page;
    private Integer limit;
    private Integer userId;
    private String orderSn;
    private List<Integer> orderStatusArray;
    private String sort;
    private String order;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public List<Integer> getOrderStatusArray() {
        return orderStatusArray;
    }

    public void setOrderStatusArray(List<Integer> orderStatusArray) {
        this.orderStatusArray = orderStatusArray;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
