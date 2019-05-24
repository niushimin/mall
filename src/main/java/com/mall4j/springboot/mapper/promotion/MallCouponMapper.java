package com.mall4j.springboot.mapper.promotion;

import com.mall4j.springboot.pojo.MallCoupon;
import com.mall4j.springboot.pojo.MallCouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallCouponMapper {
    long countByExample(MallCouponExample example);

    int deleteByExample(MallCouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCoupon record);

    int insertSelective(MallCoupon record);

    List<MallCoupon> selectByExample(MallCouponExample example);

    MallCoupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallCoupon record, @Param("example") MallCouponExample example);

    int updateByExample(@Param("record") MallCoupon record, @Param("example") MallCouponExample example);

    int updateByPrimaryKeySelective(MallCoupon record);

    int updateByPrimaryKey(MallCoupon record);
}