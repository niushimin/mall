package com.mall4j.springboot.mapper.malladmin;

import com.mall4j.springboot.pojo.MallAdmin;
import com.mall4j.springboot.pojo.MallAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallAdminMapper {
    long countByExample(MallAdminExample example);

    int deleteByExample(MallAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallAdmin record);

    int insertSelective(MallAdmin record);

    List<MallAdmin> selectByExample(MallAdminExample example);

    MallAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallAdmin record, @Param("example") MallAdminExample example);

    int updateByExample(@Param("record") MallAdmin record, @Param("example") MallAdminExample example);

    int updateByPrimaryKeySelective(MallAdmin record);

    int updateByPrimaryKey(MallAdmin record);
}