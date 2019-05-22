package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallFootprint;
import com.mall4j.springboot.pojo.MallFootprintExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallFootprintMapper {
    long countByExample(MallFootprintExample example);

    int deleteByExample(MallFootprintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallFootprint record);

    int insertSelective(MallFootprint record);

    List<MallFootprint> selectByExample(MallFootprintExample example);

    MallFootprint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallFootprint record, @Param("example") MallFootprintExample example);

    int updateByExample(@Param("record") MallFootprint record, @Param("example") MallFootprintExample example);

    int updateByPrimaryKeySelective(MallFootprint record);

    int updateByPrimaryKey(MallFootprint record);
}