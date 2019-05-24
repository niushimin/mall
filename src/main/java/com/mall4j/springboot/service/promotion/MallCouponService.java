package com.mall4j.springboot.service.promotion;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallCoupon;

public interface MallCouponService {
    ReponseVoo getList(RequestListParams requestListParams, String name, Short type, Short status);

    ReponseVoo update(MallCoupon mallCoupon);

    ReponseVoo create(MallCoupon mallCoupon);

    ReponseVoo delete(MallCoupon mallCoupon);

    ReponseVoo read(MallCoupon mallCoupon);
}
