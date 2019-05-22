package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallUser;
import com.mall4j.springboot.pojo.MallUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallUserMapper {
    long countByExample(MallUserExample example);

    int deleteByExample(MallUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallUser record);

    int insertSelective(MallUser record);

    List<MallUser> selectByExample(MallUserExample example);

    MallUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallUser record, @Param("example") MallUserExample example);

    int updateByExample(@Param("record") MallUser record, @Param("example") MallUserExample example);

    int updateByPrimaryKeySelective(MallUser record);

    int updateByPrimaryKey(MallUser record);
}