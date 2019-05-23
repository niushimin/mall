package com.mall4j.springboot.mapper.mallregion;

import com.mall4j.springboot.pojo.mallregion.MallRegion;
import com.mall4j.springboot.pojo.mallregion.MallRegionExample;
import com.mall4j.springboot.pojo.mallregion.MallRegionProvince;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallRegionMapper {
    long countByExample(MallRegionExample example);

    int deleteByExample(MallRegionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallRegion record);

    int insertSelective(MallRegion record);

    List<MallRegion> selectByExample(MallRegionExample example);

    MallRegion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallRegion record, @Param("example") MallRegionExample example);

    int updateByExample(@Param("record") MallRegion record, @Param("example") MallRegionExample example);

    int updateByPrimaryKeySelective(MallRegion record);

    int updateByPrimaryKey(MallRegion record);


    // 自己写的接口
    List<MallRegionProvince> queryMallRegionProvinceList();
}