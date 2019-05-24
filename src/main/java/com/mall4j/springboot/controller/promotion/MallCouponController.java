package com.mall4j.springboot.controller.promotion;


import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallAd;
import com.mall4j.springboot.pojo.MallCoupon;
import com.mall4j.springboot.service.promotion.MallCouponService;
import com.mall4j.springboot.service.promotion.MallCouponUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupon")
public class MallCouponController {

    @Autowired
    MallCouponService mallCouponService;
    @Autowired
    MallCouponUserService mallCouponUserService;

    //回显数据
    @RequestMapping("/list")
    public ReponseVoo getList(RequestListParams requestListParams, String name, Short type, Short status) {
        ReponseVoo reponseVoo = mallCouponService.getList(requestListParams, name, type, status);
        return reponseVoo;
    }

    //回显数据
    @RequestMapping("/listuser")
    public ReponseVoo getList(RequestListParams requestListParams, Integer userId, Short status) {
        ReponseVoo reponseVoo = mallCouponUserService.getList(requestListParams, userId, status);
        return reponseVoo;
    }

    //编辑
    @RequestMapping("/update")
    public ReponseVoo update(@RequestBody MallCoupon mallCoupon) {
        ReponseVoo reponseVoo = mallCouponService.update(mallCoupon);
        return reponseVoo;
    }

    //添加
    @RequestMapping("/create")
    public ReponseVoo create(@RequestBody MallCoupon mallCoupon) {
        ReponseVoo reponseVoo = mallCouponService.create(mallCoupon);
        return reponseVoo;
    }

    //删除
    @RequestMapping("/delete")
    public ReponseVoo delete(@RequestBody MallCoupon mallCoupon) {
        ReponseVoo reponseVoo = mallCouponService.delete(mallCoupon);
        return reponseVoo;
    }

    //详情
    @RequestMapping("/read")
    public ReponseVoo read(Integer id) {
        ReponseVoo reponseVoo = mallCouponService.read(id);
        return reponseVoo;
    }

}
