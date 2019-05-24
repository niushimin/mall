package com.mall4j.springboot.service.promotion.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.promotion.MallCouponMapper;
import com.mall4j.springboot.pojo.MallAd;
import com.mall4j.springboot.pojo.MallAdExample;
import com.mall4j.springboot.pojo.MallCoupon;
import com.mall4j.springboot.pojo.MallCouponExample;
import com.mall4j.springboot.service.promotion.MallCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class MallCouponServiceImpl implements MallCouponService {

    @Autowired
    MallCouponMapper mallCouponMapper;

    @Override
    public ReponseVoo getList(RequestListParams requestListParams, String name, Short type, Short status) {
        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        MallCouponExample example = new MallCouponExample();
        MallCouponExample.Criteria criteria = example.createCriteria();
        if (name != null){
            criteria.andNameLike("%" + name + "%");
        }
        if (type != null){
            criteria.andTypeEqualTo(type);
        }
        if (status != null){
            criteria.andStatusEqualTo(status);
        }
        List<MallCoupon> mallCoupons = mallCouponMapper.selectByExample(example);
        PageInfo<MallCoupon> pageInfo = new PageInfo<>(mallCoupons);
        ReponsePage<MallCoupon> reponsePage = new ReponsePage<>(mallCoupons,pageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }

    @Override
    public ReponseVoo update(MallCoupon mallCoupon) {
        int i = mallCouponMapper.updateByPrimaryKeySelective(mallCoupon);
        ReponseVoo<MallCoupon> reponseVoo = new ReponseVoo<>(mallCoupon);
        return reponseVoo;
    }

    @Override
    public ReponseVoo create(MallCoupon mallCoupon) {
        int i = mallCouponMapper.insertSelective(mallCoupon);
        ReponseVoo<MallCoupon> reponseVoo = new ReponseVoo<>(mallCoupon);
        return reponseVoo;
    }

    @Override
    public ReponseVoo delete(MallCoupon mallCoupon) {
        int i = mallCouponMapper.deleteByPrimaryKey(mallCoupon.getId());
        ReponseVoo reponseVoo = new ReponseVoo();
        return reponseVoo;
    }

    @Override
    public ReponseVoo read(Integer id) {
        MallCoupon mallCoupon1 = mallCouponMapper.selectByPrimaryKey(id);
        ReponseVoo<MallCoupon> reponseVoo = new ReponseVoo<>(mallCoupon1);
        return reponseVoo;

    }


}
