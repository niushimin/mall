package com.mall4j.springboot.service.mallorder;

import com.mall4j.springboot.pojo.mallorder.OrderPageVo;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/24 15:03
 * @Description:
 */

public interface MallOrderService {

    Map<String, Object> queryMallOrderPageList(OrderPageVo orderPageVo);
}
