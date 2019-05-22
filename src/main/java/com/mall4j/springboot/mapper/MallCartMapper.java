package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallCart;
import com.mall4j.springboot.pojo.MallCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallCartMapper {
    long countByExample(MallCartExample example);

    int deleteByExample(MallCartExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallCart record);

    int insertSelective(MallCart record);

    List<MallCart> selectByExample(MallCartExample example);

    MallCart selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallCart record, @Param("example") MallCartExample example);

    int updateByExample(@Param("record") MallCart record, @Param("example") MallCartExample example);

    int updateByPrimaryKeySelective(MallCart record);

    int updateByPrimaryKey(MallCart record);
}