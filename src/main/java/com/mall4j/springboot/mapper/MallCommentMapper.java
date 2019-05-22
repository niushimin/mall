package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallComment;
import com.mall4j.springboot.pojo.MallCommentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallCommentMapper {
    long countByExample(MallCommentExample example);

    int deleteByExample(MallCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallComment record);

    int insertSelective(MallComment record);

    List<MallComment> selectByExample(MallCommentExample example);

    MallComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallComment record, @Param("example") MallCommentExample example);

    int updateByExample(@Param("record") MallComment record, @Param("example") MallCommentExample example);

    int updateByPrimaryKeySelective(MallComment record);

    int updateByPrimaryKey(MallComment record);
}