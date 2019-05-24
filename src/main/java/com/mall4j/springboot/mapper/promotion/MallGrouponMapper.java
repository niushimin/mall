package com.mall4j.springboot.mapper.promotion;

import com.mall4j.springboot.pojo.MallGroupon;
import com.mall4j.springboot.pojo.MallGrouponExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallGrouponMapper {
    long countByExample(MallGrouponExample example);

    int deleteByExample(MallGrouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallGroupon record);

    int insertSelective(MallGroupon record);

    List<MallGroupon> selectByExample(MallGrouponExample example);

    MallGroupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallGroupon record, @Param("example") MallGrouponExample example);

    int updateByExample(@Param("record") MallGroupon record, @Param("example") MallGrouponExample example);

    int updateByPrimaryKeySelective(MallGroupon record);

    int updateByPrimaryKey(MallGroupon record);
}