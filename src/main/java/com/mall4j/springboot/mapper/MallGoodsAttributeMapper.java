package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallGoodsAttribute;
import com.mall4j.springboot.pojo.MallGoodsAttributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallGoodsAttributeMapper {
    long countByExample(MallGoodsAttributeExample example);

    int deleteByExample(MallGoodsAttributeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoodsAttribute record);

    int insertSelective(MallGoodsAttribute record);

    List<MallGoodsAttribute> selectByExample(MallGoodsAttributeExample example);

    MallGoodsAttribute selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallGoodsAttribute record, @Param("example") MallGoodsAttributeExample example);

    int updateByExample(@Param("record") MallGoodsAttribute record, @Param("example") MallGoodsAttributeExample example);

    int updateByPrimaryKeySelective(MallGoodsAttribute record);

    int updateByPrimaryKey(MallGoodsAttribute record);
}