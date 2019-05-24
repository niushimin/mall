package com.mall4j.springboot.controller.promotion;


import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallAd;
import com.mall4j.springboot.pojo.MallGroupon;
import com.mall4j.springboot.pojo.MallGrouponRules;
import com.mall4j.springboot.service.promotion.MallGrouponRulesService;
import com.mall4j.springboot.service.promotion.MallGrouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/groupon")
public class MallGrouponController {

    @Autowired
    MallGrouponService mallGrouponService;
    @Autowired
    MallGrouponRulesService mallGrouponRulesService;

    //回显数据团购规则
    @RequestMapping("/list")
    public ReponseVoo getList(RequestListParams requestListParams, String goodsId) {
        ReponseVoo reponseVoo = mallGrouponRulesService.getList(requestListParams, goodsId);
        return reponseVoo;
    }

    //回显数据团购活动
    @RequestMapping("/listRecord")
    public ReponseVoo queryList(RequestListParams requestListParams, String rulesId) {
        ReponseVoo reponseVoo = mallGrouponService.queryList(requestListParams, rulesId);
        return reponseVoo;
    }

    //编辑
    @RequestMapping("/update")
    public ReponseVoo update(@RequestBody MallGrouponRules mallGrouponRules) {
        ReponseVoo reponseVoo = mallGrouponRulesService.update(mallGrouponRules);
        return reponseVoo;
    }

    //添加
    @RequestMapping("/create")
    public ReponseVoo create(@RequestBody MallGrouponRules mallGrouponRules) {
        ReponseVoo reponseVoo = mallGrouponRulesService.create(mallGrouponRules);
        return reponseVoo;
    }

    //删除
    @RequestMapping("/delete")
    public ReponseVoo delete(@RequestBody MallGrouponRules mallGrouponRules) {
        ReponseVoo reponseVoo = mallGrouponRulesService.delete(mallGrouponRules);
        return reponseVoo;
    }
}

