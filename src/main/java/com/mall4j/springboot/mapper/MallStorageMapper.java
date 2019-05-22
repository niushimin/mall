package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallStorage;
import com.mall4j.springboot.pojo.MallStorageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallStorageMapper {
    long countByExample(MallStorageExample example);

    int deleteByExample(MallStorageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallStorage record);

    int insertSelective(MallStorage record);

    List<MallStorage> selectByExample(MallStorageExample example);

    MallStorage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallStorage record, @Param("example") MallStorageExample example);

    int updateByExample(@Param("record") MallStorage record, @Param("example") MallStorageExample example);

    int updateByPrimaryKeySelective(MallStorage record);

    int updateByPrimaryKey(MallStorage record);
}