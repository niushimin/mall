package com.mall4j.springboot.service.promotion;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallGroupon;

public interface MallGrouponService {


    ReponseVoo queryList(RequestListParams requestListParams, String rulesId);
}
