package com.mall4j.springboot.service.product;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;

public interface GoodsService {
    ReponseVoo getProductList(RequestListParams requestListParams);
}
