package com.mall4j.springboot.controller.mallorder;

import com.mall4j.springboot.pojo.common.ResponseVo;
import com.mall4j.springboot.pojo.mallissue.IssuePageVo;
import com.mall4j.springboot.pojo.mallorder.OrderPageVo;
import com.mall4j.springboot.service.mallorder.MallOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/24 14:56
 * @Description:
 */

@RestController
@RequestMapping("/order")
public class MallOrderController {

    @Autowired
    MallOrderService mallOrderService;

    /**
     * 展示订单列表
     * @param orderPageVo
     * @return
     */
    @RequestMapping("/list")
    public ResponseVo list(OrderPageVo orderPageVo) {
        Map<String, Object> data = mallOrderService.queryMallOrderPageList(orderPageVo);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }
}
