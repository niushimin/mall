package com.mall4j.springboot.service.promotion.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.promotion.MallCouponUserMapper;
import com.mall4j.springboot.pojo.MallCoupon;
import com.mall4j.springboot.pojo.MallCouponExample;
import com.mall4j.springboot.pojo.MallCouponUser;
import com.mall4j.springboot.pojo.MallCouponUserExample;
import com.mall4j.springboot.service.promotion.MallCouponUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MallCouponUseServiceImpl implements MallCouponUserService {
    @Autowired
    MallCouponUserMapper mallCouponUserMapper;

    @Override
    public ReponseVoo getList(RequestListParams requestListParams, Integer userId, Short status) {
        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        MallCouponUserExample example = new MallCouponUserExample();
        MallCouponUserExample.Criteria criteria = example.createCriteria();
        if (userId != null){
            criteria.andUserIdEqualTo(userId);
        }
        if (status != null){
            criteria.andStatusEqualTo(status);
        }
        List<MallCouponUser> mallCouponUsers = mallCouponUserMapper.selectByExample(example);
        PageInfo<MallCouponUser> pageInfo = new PageInfo<>(mallCouponUsers);
        ReponsePage<MallCouponUser> reponsePage = new ReponsePage<>(mallCouponUsers,pageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }
}
