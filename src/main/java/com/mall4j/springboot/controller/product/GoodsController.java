package com.mall4j.springboot.controller.product;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallGoods;
import com.mall4j.springboot.service.product.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    /*回显商品列表*/
    @RequestMapping("/list")
    public ReponseVoo getProductList(RequestListParams requestListParams, String goodsSn, String name){
        ReponseVoo reponseVoo = goodsService.getProductList(requestListParams,goodsSn,name);
        return reponseVoo;
    }
    /*删除商品*/
    @RequestMapping("/delete")
    public ReponseVoo deleteProductById(@RequestBody MallGoods mallGoods){
        ReponseVoo reponseVoo = goodsService.deleteProductById(mallGoods);
        return reponseVoo;
    }
    /*新增商品 回显种类数据*/
    @RequestMapping("/catAndBrand")
    public ReponseVoo insertCatAndBrand(){

        return null;
    }
    /*新增商品*/
    @RequestMapping("/create")
    public ReponseVoo insertProduct(){
        return null;
    }

}
