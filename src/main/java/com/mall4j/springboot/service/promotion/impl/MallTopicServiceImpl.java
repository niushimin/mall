package com.mall4j.springboot.service.promotion.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.promotion.MallTopicMapper;
import com.mall4j.springboot.pojo.MallCoupon;
import com.mall4j.springboot.pojo.MallCouponExample;
import com.mall4j.springboot.pojo.MallTopic;
import com.mall4j.springboot.pojo.MallTopicExample;
import com.mall4j.springboot.service.promotion.MallTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MallTopicServiceImpl implements MallTopicService {

    @Autowired
    MallTopicMapper mallTopicMapper;


    @Override
    public ReponseVoo getList(RequestListParams requestListParams, String title, String subtitle) {
        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        MallTopicExample example = new MallTopicExample();
        MallTopicExample.Criteria criteria = example.createCriteria();
        if (title != null){
            criteria.andTitleLike("%" + title + "%");
        }
        if (subtitle != null){
            criteria.andSubtitleLike("%" + subtitle + "%");
        }
        List<MallTopic> mallTopics = mallTopicMapper.selectByExampleWithBLOBs(example);
        PageInfo<MallTopic> pageInfo = new PageInfo<>(mallTopics);
        ReponsePage<MallTopic> reponsePage = new ReponsePage<>(mallTopics,pageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }

    @Override
    public ReponseVoo update(MallTopic mallTopic) {
        int i = mallTopicMapper.updateByPrimaryKeySelective(mallTopic);
        ReponseVoo<MallTopic> reponseVoo = new ReponseVoo<>(mallTopic);
        return reponseVoo;
    }

    @Override
    public ReponseVoo create(MallTopic mallTopic) {
        int i = mallTopicMapper.insertSelective(mallTopic);
        ReponseVoo<MallTopic> reponseVoo = new ReponseVoo<>(mallTopic);
        return reponseVoo;
    }

    @Override
    public ReponseVoo delete(MallTopic mallTopic) {
        int i = mallTopicMapper.deleteByPrimaryKey(mallTopic.getId());
        ReponseVoo reponseVoo = new ReponseVoo();
        return reponseVoo;
    }

    @Override
    public ReponseVoo read(MallTopic mallTopic) {
        MallTopic mallTopic1 = mallTopicMapper.selectByPrimaryKey(mallTopic.getId());
        ReponseVoo<MallTopic> reponseVoo = new ReponseVoo<>(mallTopic1);
        return reponseVoo;
    }

}
