package com.mall4j.springboot.service.mallorder.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.mapper.mallorder.MallOrderMapper;
import com.mall4j.springboot.pojo.mallorder.MallOrder;
import com.mall4j.springboot.pojo.mallorder.OrderPageVo;
import com.mall4j.springboot.service.mallorder.MallOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/24 15:03
 * @Description:
 */

@Service
public class MallOrderServiceImpl implements MallOrderService {

    @Autowired
    MallOrderMapper mallOrderMapper;

    @Override
    public Map<String, Object> queryMallOrderPageList(OrderPageVo orderPageVo) {
        PageHelper.startPage(orderPageVo.getPage(), orderPageVo.getLimit());
        List<MallOrder> list = mallOrderMapper.queryMallOrderPageList(orderPageVo);
        PageInfo<MallOrder> page = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>(16);
        map.put("items", page.getList());
        map.put("total", page.getTotal());
        return map;
    }
}
