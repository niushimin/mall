package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallOrder;
import com.mall4j.springboot.pojo.MallOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallOrderMapper {
    long countByExample(MallOrderExample example);

    int deleteByExample(MallOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    List<MallOrder> selectByExample(MallOrderExample example);

    MallOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallOrder record, @Param("example") MallOrderExample example);

    int updateByExample(@Param("record") MallOrder record, @Param("example") MallOrderExample example);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);
}