package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallCategory;
import com.mall4j.springboot.pojo.MallCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallCategoryMapper {
    long countByExample(MallCategoryExample example);

    int deleteByExample(MallCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCategory record);

    int insertSelective(MallCategory record);

    List<MallCategory> selectByExample(MallCategoryExample example);

    MallCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallCategory record, @Param("example") MallCategoryExample example);

    int updateByExample(@Param("record") MallCategory record, @Param("example") MallCategoryExample example);

    int updateByPrimaryKeySelective(MallCategory record);

    int updateByPrimaryKey(MallCategory record);
}