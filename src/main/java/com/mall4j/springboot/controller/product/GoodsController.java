package com.mall4j.springboot.controller.product;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.service.product.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    /*回显商品列表*/
    @RequestMapping("/list")
    public ReponseVoo getProductList(RequestListParams requestListParams){
        ReponseVoo reponseVoo = goodsService.getProductList(requestListParams);
        return reponseVoo;
    }
}
