package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallUserFormid;
import com.mall4j.springboot.pojo.MallUserFormidExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallUserFormidMapper {
    long countByExample(MallUserFormidExample example);

    int deleteByExample(MallUserFormidExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallUserFormid record);

    int insertSelective(MallUserFormid record);

    List<MallUserFormid> selectByExample(MallUserFormidExample example);

    MallUserFormid selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallUserFormid record, @Param("example") MallUserFormidExample example);

    int updateByExample(@Param("record") MallUserFormid record, @Param("example") MallUserFormidExample example);

    int updateByPrimaryKeySelective(MallUserFormid record);

    int updateByPrimaryKey(MallUserFormid record);
}