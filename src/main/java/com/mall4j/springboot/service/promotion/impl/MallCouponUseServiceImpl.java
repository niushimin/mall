package com.mall4j.springboot.service.promotion.impl;

import com.mall4j.springboot.mapper.promotion.MallCouponUserMapper;
import com.mall4j.springboot.service.promotion.MallCouponUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MallCouponUseServiceImpl implements MallCouponUserService {
    @Autowired
    MallCouponUserMapper mallCouponUserMapper;

}
