package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallAddress;
import com.mall4j.springboot.pojo.MallAddressExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallAddressMapper {
    long countByExample(MallAddressExample example);

    int deleteByExample(MallAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallAddress record);

    int insertSelective(MallAddress record);

    List<MallAddress> selectByExample(MallAddressExample example);

    MallAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallAddress record, @Param("example") MallAddressExample example);

    int updateByExample(@Param("record") MallAddress record, @Param("example") MallAddressExample example);

    int updateByPrimaryKeySelective(MallAddress record);

    int updateByPrimaryKey(MallAddress record);
}