package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallGoodsSpecification;
import com.mall4j.springboot.pojo.MallGoodsSpecificationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallGoodsSpecificationMapper {
    long countByExample(MallGoodsSpecificationExample example);

    int deleteByExample(MallGoodsSpecificationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoodsSpecification record);

    int insertSelective(MallGoodsSpecification record);

    List<MallGoodsSpecification> selectByExample(MallGoodsSpecificationExample example);

    MallGoodsSpecification selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallGoodsSpecification record, @Param("example") MallGoodsSpecificationExample example);

    int updateByExample(@Param("record") MallGoodsSpecification record, @Param("example") MallGoodsSpecificationExample example);

    int updateByPrimaryKeySelective(MallGoodsSpecification record);

    int updateByPrimaryKey(MallGoodsSpecification record);
}