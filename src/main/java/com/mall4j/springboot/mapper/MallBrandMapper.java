package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallBrand;
import com.mall4j.springboot.pojo.MallBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallBrandMapper {
    long countByExample(MallBrandExample example);

    int deleteByExample(MallBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallBrand record);

    int insertSelective(MallBrand record);

    List<MallBrand> selectByExample(MallBrandExample example);

    MallBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    int updateByExample(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    int updateByPrimaryKeySelective(MallBrand record);

    int updateByPrimaryKey(MallBrand record);
}