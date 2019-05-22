package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallAd;
import com.mall4j.springboot.pojo.MallAdExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallAdMapper {
    long countByExample(MallAdExample example);

    int deleteByExample(MallAdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallAd record);

    int insertSelective(MallAd record);

    List<MallAd> selectByExample(MallAdExample example);

    MallAd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallAd record, @Param("example") MallAdExample example);

    int updateByExample(@Param("record") MallAd record, @Param("example") MallAdExample example);

    int updateByPrimaryKeySelective(MallAd record);

    int updateByPrimaryKey(MallAd record);
}