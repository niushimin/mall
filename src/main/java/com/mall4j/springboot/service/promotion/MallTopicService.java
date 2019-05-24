package com.mall4j.springboot.service.promotion;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallTopic;

public interface MallTopicService {
    ReponseVoo getList(RequestListParams requestListParams, String title, String subtitle);

    ReponseVoo update(MallTopic mallTopic);

    ReponseVoo create(MallTopic mallTopic);

    ReponseVoo delete(MallTopic mallTopic);

    ReponseVoo read(MallTopic mallTopic);
}
