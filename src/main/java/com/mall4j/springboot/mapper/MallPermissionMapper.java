package com.mall4j.springboot.mapper;

import com.mall4j.springboot.pojo.MallPermission;
import com.mall4j.springboot.pojo.MallPermissionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallPermissionMapper {
    long countByExample(MallPermissionExample example);

    int deleteByExample(MallPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallPermission record);

    int insertSelective(MallPermission record);

    List<MallPermission> selectByExample(MallPermissionExample example);

    MallPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallPermission record, @Param("example") MallPermissionExample example);

    int updateByExample(@Param("record") MallPermission record, @Param("example") MallPermissionExample example);

    int updateByPrimaryKeySelective(MallPermission record);

    int updateByPrimaryKey(MallPermission record);
}