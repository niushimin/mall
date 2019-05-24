package com.mall4j.springboot.mapper.mallkeyword;

import com.mall4j.springboot.pojo.mallkeyword.KeywordPageVo;
import com.mall4j.springboot.pojo.mallkeyword.MallKeyword;
import com.mall4j.springboot.pojo.mallkeyword.MallKeywordExample;
import com.mall4j.springboot.pojo.mallkeyword.MallKeywordVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MallKeywordMapper {
    long countByExample(MallKeywordExample example);

    int deleteByExample(MallKeywordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MallKeyword record);

    int insertSelective(MallKeyword record);

    List<MallKeyword> selectByExample(MallKeywordExample example);

    MallKeyword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MallKeyword record, @Param("example") MallKeywordExample example);

    int updateByExample(@Param("record") MallKeyword record, @Param("example") MallKeywordExample example);

    int updateByPrimaryKeySelective(MallKeyword record);

    int updateByPrimaryKey(MallKeyword record);


    // 自己实现的接口
    List<MallKeyword> queryMallKeywordPageList(KeywordPageVo keywordPageVo);

    int createNewMallKeyword(MallKeyword mallKeyword);

    MallKeywordVo selectMallKeywordVoById(int id);
}