package com.mall4j.springboot.service.promotion;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallAd;

public interface MallAdService {
    ReponseVoo getList(RequestListParams requestListParams, String name, String content);

    ReponseVoo update(MallAd mallAd);

    ReponseVoo create(MallAd mallAd);

    ReponseVoo delete(MallAd mallAd);
}
