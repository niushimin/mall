package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallSystem;
import com.mall4j.springboot.pojo.MallSystemExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallSystemMapper {
    long countByExample(MallSystemExample example);

    int deleteByExample(MallSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallSystem record);

    int insertSelective(MallSystem record);

    List<MallSystem> selectByExample(MallSystemExample example);

    MallSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallSystem record, @Param("example") MallSystemExample example);

    int updateByExample(@Param("record") MallSystem record, @Param("example") MallSystemExample example);

    int updateByPrimaryKeySelective(MallSystem record);

    int updateByPrimaryKey(MallSystem record);
}