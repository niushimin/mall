package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallGrouponRules;
import com.mall4j.springboot.pojo.MallGrouponRulesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallGrouponRulesMapper {
    long countByExample(MallGrouponRulesExample example);

    int deleteByExample(MallGrouponRulesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGrouponRules record);

    int insertSelective(MallGrouponRules record);

    List<MallGrouponRules> selectByExample(MallGrouponRulesExample example);

    MallGrouponRules selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallGrouponRules record, @Param("example") MallGrouponRulesExample example);

    int updateByExample(@Param("record") MallGrouponRules record, @Param("example") MallGrouponRulesExample example);

    int updateByPrimaryKeySelective(MallGrouponRules record);

    int updateByPrimaryKey(MallGrouponRules record);
}