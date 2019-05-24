package com.mall4j.springboot.service.promotion.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.promotion.MallGrouponMapper;
import com.mall4j.springboot.pojo.*;
import com.mall4j.springboot.service.promotion.MallGrouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MallGrouponServiceImpl implements MallGrouponService {

    @Autowired
    MallGrouponMapper mallGrouponMapper;


    @Override
    public ReponseVoo queryList(RequestListParams requestListParams, String rulesId) {
        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        MallGrouponExample example = new MallGrouponExample();
        MallGrouponExample.Criteria criteria = example.createCriteria();
        if (rulesId != null){
            criteria.andRulesIdEqualTo(Integer.parseInt(rulesId));
        }
        List<MallGroupon> mallGroupons = mallGrouponMapper.selectByExample(example);
        PageInfo<MallGroupon> pageInfo = new PageInfo<>(mallGroupons);
        ReponsePage<MallGroupon> reponsePage = new ReponsePage<>(mallGroupons,pageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }
}
