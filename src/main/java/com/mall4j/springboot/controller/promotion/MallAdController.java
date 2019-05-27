package com.mall4j.springboot.controller.promotion;


import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallAd;
import com.mall4j.springboot.service.promotion.MallAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin/ad")
public class MallAdController {

    @Autowired
    MallAdService mallAdService;

    //回显数据
    @RequestMapping("/list")
    public ReponseVoo getList(RequestListParams requestListParams, String name, String content) {
        ReponseVoo reponseVoo = mallAdService.getList(requestListParams, name, content);
        return reponseVoo;
    }

    //编辑
    @RequestMapping("/update")
    public ReponseVoo update(@RequestBody MallAd mallAd) {
        ReponseVoo reponseVoo = mallAdService.update(mallAd);
        return reponseVoo;
    }

    //添加
    @RequestMapping("/create")
    public ReponseVoo create(@RequestBody MallAd mallAd) {
        ReponseVoo reponseVoo = mallAdService.create(mallAd);
        return reponseVoo;
    }

    //删除
    @RequestMapping("/delete")
    public ReponseVoo delete(@RequestBody MallAd mallAd) {
        ReponseVoo reponseVoo = mallAdService.delete(mallAd);
        return reponseVoo;
    }
}



