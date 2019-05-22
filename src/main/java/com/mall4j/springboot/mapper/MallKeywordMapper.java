package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallKeyword;
import com.mall4j.springboot.pojo.MallKeywordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallKeywordMapper {
    long countByExample(MallKeywordExample example);

    int deleteByExample(MallKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallKeyword record);

    int insertSelective(MallKeyword record);

    List<MallKeyword> selectByExample(MallKeywordExample example);

    MallKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallKeyword record, @Param("example") MallKeywordExample example);

    int updateByExample(@Param("record") MallKeyword record, @Param("example") MallKeywordExample example);

    int updateByPrimaryKeySelective(MallKeyword record);

    int updateByPrimaryKey(MallKeyword record);
}