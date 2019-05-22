package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallFeedback;
import com.mall4j.springboot.pojo.MallFeedbackExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallFeedbackMapper {
    long countByExample(MallFeedbackExample example);

    int deleteByExample(MallFeedbackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallFeedback record);

    int insertSelective(MallFeedback record);

    List<MallFeedback> selectByExample(MallFeedbackExample example);

    MallFeedback selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallFeedback record, @Param("example") MallFeedbackExample example);

    int updateByExample(@Param("record") MallFeedback record, @Param("example") MallFeedbackExample example);

    int updateByPrimaryKeySelective(MallFeedback record);

    int updateByPrimaryKey(MallFeedback record);
}