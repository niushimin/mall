package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallCollect;
import com.mall4j.springboot.pojo.MallCollectExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallCollectMapper {
    long countByExample(MallCollectExample example);

    int deleteByExample(MallCollectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCollect record);

    int insertSelective(MallCollect record);

    List<MallCollect> selectByExample(MallCollectExample example);

    MallCollect selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallCollect record, @Param("example") MallCollectExample example);

    int updateByExample(@Param("record") MallCollect record, @Param("example") MallCollectExample example);

    int updateByPrimaryKeySelective(MallCollect record);

    int updateByPrimaryKey(MallCollect record);
}