package com.mall4j.springboot.service.promotion.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.MallGoodsMapper;
import com.mall4j.springboot.mapper.promotion.MallGrouponRulesMapper;
import com.mall4j.springboot.pojo.*;
import com.mall4j.springboot.service.promotion.MallGrouponRulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


@Service
public class MallGrouponRulesServiceImpl implements MallGrouponRulesService {

    @Autowired
    MallGrouponRulesMapper mallGrouponRulesMapper;
    @Autowired
    MallGoodsMapper mallGoodsMapper;


    @Override
    public ReponseVoo getList(RequestListParams requestListParams, String goodsId) {
        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        MallGrouponRulesExample example = new MallGrouponRulesExample();
        MallGrouponRulesExample.Criteria criteria = example.createCriteria();
        if (goodsId != null){
            criteria.andGoodsIdEqualTo(Integer.parseInt(goodsId));
        }
        List<MallGrouponRules> mallGrouponRules = mallGrouponRulesMapper.selectByExample(example);
        PageInfo<MallGrouponRules> pageInfo = new PageInfo<>(mallGrouponRules);
        ReponsePage<MallGrouponRules> reponsePage = new ReponsePage<>(mallGrouponRules,pageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }

    @Override
    public ReponseVoo update(MallGrouponRules mallGrouponRules) {
        int i = mallGrouponRulesMapper.updateByPrimaryKeySelective(mallGrouponRules);
        ReponseVoo<MallGrouponRules> reponseVoo = new ReponseVoo<>(mallGrouponRules);
        return reponseVoo;
    }

    @Override
    public ReponseVoo create(MallGrouponRules mallGrouponRules) {

        MallGoods mallGoods1 = mallGoodsMapper.selectByPrimaryKey(mallGrouponRules.getGoodsId());
        mallGrouponRules.setGoodsName(mallGoods1.getName());
        mallGrouponRules.setPicUrl(mallGoods1.getPicUrl());
        mallGrouponRules.setAddTime(new Date());
        int i = mallGrouponRulesMapper.insertSelective(mallGrouponRules);
        ReponseVoo<MallGrouponRules> reponseVoo = new ReponseVoo<>(mallGrouponRules);
        return reponseVoo;
    }

    @Override
    public ReponseVoo delete(MallGrouponRules mallGrouponRules) {
        int i = mallGrouponRulesMapper.deleteByPrimaryKey(mallGrouponRules.getId());
        ReponseVoo reponseVoo = new ReponseVoo();
        return reponseVoo;
    }
}
