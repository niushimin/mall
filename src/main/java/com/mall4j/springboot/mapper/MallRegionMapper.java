package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallRegion;
import com.mall4j.springboot.pojo.MallRegionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallRegionMapper {
    long countByExample(MallRegionExample example);

    int deleteByExample(MallRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallRegion record);

    int insertSelective(MallRegion record);

    List<MallRegion> selectByExample(MallRegionExample example);

    MallRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallRegion record, @Param("example") MallRegionExample example);

    int updateByExample(@Param("record") MallRegion record, @Param("example") MallRegionExample example);

    int updateByPrimaryKeySelective(MallRegion record);

    int updateByPrimaryKey(MallRegion record);
}