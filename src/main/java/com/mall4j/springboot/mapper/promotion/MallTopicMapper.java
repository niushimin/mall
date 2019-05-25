package com.mall4j.springboot.mapper.promotion;

import com.mall4j.springboot.pojo.MallTopic;
import com.mall4j.springboot.pojo.MallTopicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallTopicMapper {
    long countByExample(MallTopicExample example);

    int deleteByExample(MallTopicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallTopic record);

    int insertSelective(MallTopic record);

    List<MallTopic> selectByExampleWithBLOBs(MallTopicExample example);

    List<MallTopic> selectByExample(MallTopicExample example);

    MallTopic selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallTopic record, @Param("example") MallTopicExample example);

    int updateByExampleWithBLOBs(@Param("record") MallTopic record, @Param("example") MallTopicExample example);

    int updateByExample(@Param("record") MallTopic record, @Param("example") MallTopicExample example);

    int updateByPrimaryKeySelective(MallTopic record);

    int updateByPrimaryKeyWithBLOBs(MallTopic record);

    int updateByPrimaryKey(MallTopic record);
}