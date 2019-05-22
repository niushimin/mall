package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallRole;
import com.mall4j.springboot.pojo.MallRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallRoleMapper {
    long countByExample(MallRoleExample example);

    int deleteByExample(MallRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallRole record);

    int insertSelective(MallRole record);

    List<MallRole> selectByExample(MallRoleExample example);

    MallRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallRole record, @Param("example") MallRoleExample example);

    int updateByExample(@Param("record") MallRole record, @Param("example") MallRoleExample example);

    int updateByPrimaryKeySelective(MallRole record);

    int updateByPrimaryKey(MallRole record);
}