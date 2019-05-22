package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallGoodsProduct;
import com.mall4j.springboot.pojo.MallGoodsProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallGoodsProductMapper {
    long countByExample(MallGoodsProductExample example);

    int deleteByExample(MallGoodsProductExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoodsProduct record);

    int insertSelective(MallGoodsProduct record);

    List<MallGoodsProduct> selectByExample(MallGoodsProductExample example);

    MallGoodsProduct selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    int updateByExample(@Param("record") MallGoodsProduct record, @Param("example") MallGoodsProductExample example);

    int updateByPrimaryKeySelective(MallGoodsProduct record);

    int updateByPrimaryKey(MallGoodsProduct record);
}