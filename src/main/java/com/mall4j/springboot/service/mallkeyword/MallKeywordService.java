package com.mall4j.springboot.service.mallkeyword;

import com.mall4j.springboot.pojo.mallkeyword.KeywordPageVo;
import com.mall4j.springboot.pojo.mallkeyword.MallKeyword;
import com.mall4j.springboot.pojo.mallkeyword.MallKeywordVo;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 19:33
 * @Description:
 */
public interface MallKeywordService {

    Map<String, Object> queryMallKeywordPageList(KeywordPageVo keywordPageVo);

    MallKeywordVo createNewMallKeyword(MallKeyword mallNewKeyword);

    void deleteMallKeyword(MallKeywordVo mallKeywordVo);

    MallKeyword updateMallKeyword(MallKeyword mallKeyword);
}
