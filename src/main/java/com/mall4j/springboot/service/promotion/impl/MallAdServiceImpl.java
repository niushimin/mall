package com.mall4j.springboot.service.promotion.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.promotion.MallAdMapper;
import com.mall4j.springboot.pojo.MallAd;
import com.mall4j.springboot.pojo.MallAdExample;
import com.mall4j.springboot.service.promotion.MallAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MallAdServiceImpl implements MallAdService {

    @Autowired
    MallAdMapper mallAdMapper;


    @Override
    public ReponseVoo getList(RequestListParams requestListParams, String name, String content) {
        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        MallAdExample example = new MallAdExample();
        MallAdExample.Criteria criteria = example.createCriteria();
        if (name != null){
            criteria.andNameLike("%" + name + "%");
        }
        if (content != null){
            criteria.andContentLike("%" + content + "%");
        }
        List<MallAd> mallAds = mallAdMapper.selectByExample(example);
        PageInfo<MallAd> pageInfo = new PageInfo<>(mallAds);
        ReponsePage<MallAd> reponsePage = new ReponsePage<>(mallAds,pageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }

    @Override
    public ReponseVoo update(MallAd mallAd) {
        MallAdExample example = new MallAdExample();
        MallAdExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(mallAd.getId());
        int i = mallAdMapper.updateByExampleSelective(mallAd,example);
        ReponseVoo<MallAd> reponseVoo = new ReponseVoo<>(mallAd);
        return reponseVoo;
    }

    @Override
    public ReponseVoo create(MallAd mallAd) {
        int i = mallAdMapper.insertSelective(mallAd);
        ReponseVoo<MallAd> reponseVoo = new ReponseVoo<>(mallAd);
        return reponseVoo;
    }

    @Override
    public ReponseVoo delete(MallAd mallAd) {
        int i = mallAdMapper.deleteByPrimaryKey(mallAd.getId());
        ReponseVoo reponseVoo = new ReponseVoo();
        return reponseVoo;
    }
}
