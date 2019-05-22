package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallSearchHistory;
import com.mall4j.springboot.pojo.MallSearchHistoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallSearchHistoryMapper {
    long countByExample(MallSearchHistoryExample example);

    int deleteByExample(MallSearchHistoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallSearchHistory record);

    int insertSelective(MallSearchHistory record);

    List<MallSearchHistory> selectByExample(MallSearchHistoryExample example);

    MallSearchHistory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallSearchHistory record, @Param("example") MallSearchHistoryExample example);

    int updateByExample(@Param("record") MallSearchHistory record, @Param("example") MallSearchHistoryExample example);

    int updateByPrimaryKeySelective(MallSearchHistory record);

    int updateByPrimaryKey(MallSearchHistory record);
}