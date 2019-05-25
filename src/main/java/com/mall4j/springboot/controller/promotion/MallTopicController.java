package com.mall4j.springboot.controller.promotion;


import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallAd;
import com.mall4j.springboot.pojo.MallTopic;
import com.mall4j.springboot.service.promotion.MallTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topic")
public class MallTopicController {

    @Autowired
    MallTopicService mallTopicService;

    //回显数据
    @RequestMapping("/list")
    public ReponseVoo getList(RequestListParams requestListParams, String title, String subtitle) {
        ReponseVoo reponseVoo = mallTopicService.getList(requestListParams, title, subtitle);
        return reponseVoo;
    }

    //编辑
    @RequestMapping("/update")
    public ReponseVoo update(@RequestBody MallTopic mallTopic) {
        ReponseVoo reponseVoo = mallTopicService.update(mallTopic);
        return reponseVoo;
    }

    //添加
    @RequestMapping("/create")
    public ReponseVoo create(@RequestBody MallTopic mallTopic) {
        ReponseVoo reponseVoo = mallTopicService.create(mallTopic);
        return reponseVoo;
    }

    //删除
    @RequestMapping("/delete")
    public ReponseVoo delete(@RequestBody MallTopic mallTopic) {
        ReponseVoo reponseVoo = mallTopicService.delete(mallTopic);
        return reponseVoo;
    }

    //详情
    @RequestMapping("/read")
    public ReponseVoo read(@RequestBody MallTopic mallTopic) {
        ReponseVoo reponseVoo = mallTopicService.read(mallTopic);
        return reponseVoo;
    }
}

