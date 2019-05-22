package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallIssue;
import com.mall4j.springboot.pojo.MallIssueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallIssueMapper {
    long countByExample(MallIssueExample example);

    int deleteByExample(MallIssueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallIssue record);

    int insertSelective(MallIssue record);

    List<MallIssue> selectByExample(MallIssueExample example);

    MallIssue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallIssue record, @Param("example") MallIssueExample example);

    int updateByExample(@Param("record") MallIssue record, @Param("example") MallIssueExample example);

    int updateByPrimaryKeySelective(MallIssue record);

    int updateByPrimaryKey(MallIssue record);
}