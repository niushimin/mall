package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallOrderGoods;
import com.mall4j.springboot.pojo.MallOrderGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallOrderGoodsMapper {
    long countByExample(MallOrderGoodsExample example);

    int deleteByExample(MallOrderGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallOrderGoods record);

    int insertSelective(MallOrderGoods record);

    List<MallOrderGoods> selectByExample(MallOrderGoodsExample example);

    MallOrderGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallOrderGoods record, @Param("example") MallOrderGoodsExample example);

    int updateByExample(@Param("record") MallOrderGoods record, @Param("example") MallOrderGoodsExample example);

    int updateByPrimaryKeySelective(MallOrderGoods record);

    int updateByPrimaryKey(MallOrderGoods record);
}