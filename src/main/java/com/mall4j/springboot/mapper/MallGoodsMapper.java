package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallGoods;
import com.mall4j.springboot.pojo.MallGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallGoodsMapper {
    long countByExample(MallGoodsExample example);

    int deleteByExample(MallGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGoods record);

    int insertSelective(MallGoods record);

    List<MallGoods> selectByExampleWithBLOBs(MallGoodsExample example);

    List<MallGoods> selectByExample(MallGoodsExample example);

    MallGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallGoods record, @Param("example") MallGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") MallGoods record, @Param("example") MallGoodsExample example);

    int updateByExample(@Param("record") MallGoods record, @Param("example") MallGoodsExample example);

    int updateByPrimaryKeySelective(MallGoods record);

    int updateByPrimaryKeyWithBLOBs(MallGoods record);

    int updateByPrimaryKey(MallGoods record);
}