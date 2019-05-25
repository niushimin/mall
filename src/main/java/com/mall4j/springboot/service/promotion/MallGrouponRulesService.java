package com.mall4j.springboot.service.promotion;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallGroupon;
import com.mall4j.springboot.pojo.MallGrouponRules;

public interface MallGrouponRulesService {
    ReponseVoo getList(RequestListParams requestListParams, String goodsId);

    ReponseVoo update(MallGrouponRules mallGrouponRules);

    ReponseVoo create(MallGrouponRules mallGrouponRules);

    ReponseVoo delete(MallGrouponRules mallGrouponRules);
}
