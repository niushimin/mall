package com.mall4j.springboot.mapper.promotion;

import com.mall4j.springboot.pojo.MallCouponUser;
import com.mall4j.springboot.pojo.MallCouponUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallCouponUserMapper {
    long countByExample(MallCouponUserExample example);

    int deleteByExample(MallCouponUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCouponUser record);

    int insertSelective(MallCouponUser record);

    List<MallCouponUser> selectByExample(MallCouponUserExample example);

    MallCouponUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallCouponUser record, @Param("example") MallCouponUserExample example);

    int updateByExample(@Param("record") MallCouponUser record, @Param("example") MallCouponUserExample example);

    int updateByPrimaryKeySelective(MallCouponUser record);

    int updateByPrimaryKey(MallCouponUser record);
}