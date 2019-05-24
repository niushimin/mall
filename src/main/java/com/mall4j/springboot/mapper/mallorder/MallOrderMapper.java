package com.mall4j.springboot.mapper.mallorder;

import com.mall4j.springboot.pojo.mallorder.MallOrder;
import com.mall4j.springboot.pojo.mallorder.MallOrderExample;
import com.mall4j.springboot.pojo.mallorder.OrderPageVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallOrderMapper {
    long countByExample(MallOrderExample example);

    int deleteByExample(MallOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallOrder record);

    int insertSelective(MallOrder record);

    List<MallOrder> selectByExample(MallOrderExample example);

    MallOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallOrder record, @Param("example") MallOrderExample example);

    int updateByExample(@Param("record") MallOrder record, @Param("example") MallOrderExample example);

    int updateByPrimaryKeySelective(MallOrder record);

    int updateByPrimaryKey(MallOrder record);



    // 自己写的接口
    List<MallOrder> queryMallOrderPageList(OrderPageVo orderPageVo);
}