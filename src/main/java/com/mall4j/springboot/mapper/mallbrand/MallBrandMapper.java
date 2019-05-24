package com.mall4j.springboot.mapper.mallbrand;

import com.mall4j.springboot.actionform.product.ReponseBrand;

import com.mall4j.springboot.pojo.mallbrand.BrandPageVo;
import com.mall4j.springboot.pojo.mallbrand.MallBrand;
import com.mall4j.springboot.pojo.mallbrand.MallBrandExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallBrandMapper {
    long countByExample(MallBrandExample example);

    int deleteByExample(MallBrandExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallBrand record);

    int insertSelective(MallBrand record);

    List<MallBrand> selectByExample(MallBrandExample example);

    MallBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    int updateByExample(@Param("record") MallBrand record, @Param("example") MallBrandExample example);

    int updateByPrimaryKeySelective(MallBrand record);

    int updateByPrimaryKey(MallBrand record);

    List<ReponseBrand> selectBand();


    // 自己写的接口
    List<MallBrand> queryMallBrandPageList(BrandPageVo requestPageVo);

    int queryMallBrandPageTotal(BrandPageVo requestPageVo);
}