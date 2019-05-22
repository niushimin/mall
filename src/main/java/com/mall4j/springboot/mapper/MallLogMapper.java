package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallLog;
import com.mall4j.springboot.pojo.MallLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallLogMapper {
    long countByExample(MallLogExample example);

    int deleteByExample(MallLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallLog record);

    int insertSelective(MallLog record);

    List<MallLog> selectByExample(MallLogExample example);

    MallLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallLog record, @Param("example") MallLogExample example);

    int updateByExample(@Param("record") MallLog record, @Param("example") MallLogExample example);

    int updateByPrimaryKeySelective(MallLog record);

    int updateByPrimaryKey(MallLog record);
}