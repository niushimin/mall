package com.mall4j.springboot.service.promotion;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;

public interface MallCouponUserService {
    ReponseVoo getList(RequestListParams requestListParams, Integer userId, Short status);
}
