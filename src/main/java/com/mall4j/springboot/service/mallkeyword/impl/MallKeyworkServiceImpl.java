package com.mall4j.springboot.service.mallkeyword.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.mapper.mallkeyword.MallKeywordMapper;
import com.mall4j.springboot.pojo.mallkeyword.KeywordPageVo;
import com.mall4j.springboot.pojo.mallkeyword.MallKeyword;
import com.mall4j.springboot.pojo.mallkeyword.MallKeywordExample;
import com.mall4j.springboot.pojo.mallkeyword.MallKeywordVo;
import com.mall4j.springboot.service.mallkeyword.MallKeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 19:34
 * @Description:
 */

@Service
public class MallKeyworkServiceImpl implements MallKeywordService {

    @Autowired
    MallKeywordMapper mallKeywordMapper;

    @Override
    public Map<String, Object> queryMallKeywordPageList(KeywordPageVo keywordPageVo) {
        PageHelper.startPage(keywordPageVo.getPage(), keywordPageVo.getLimit());
        List<MallKeyword> list = mallKeywordMapper.queryMallKeywordPageList(keywordPageVo);
        PageInfo<MallKeyword> page = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>();
        map.put("items", page.getList());
        map.put("total", page.getTotal());
        return map;
    }

    @Override
    public MallKeywordVo createNewMallKeyword(MallKeyword mallKeyword) {
        // 设置其他参数
        Date date = new Date();
        mallKeyword.setAddTime(date);
        mallKeyword.setUpdateTime(date);
        mallKeyword.setSortOrder(new Random().nextInt(100));
        mallKeyword.setDeleted(false);
        mallKeywordMapper.createNewMallKeyword(mallKeyword);
        Integer id = mallKeyword.getId();
        MallKeywordVo mallKeywordVo = mallKeywordMapper.selectMallKeywordVoById(id);
        return mallKeywordVo;
    }

    @Override
    public void deleteMallKeyword(MallKeywordVo mallKeywordVo) {
        mallKeywordMapper.deleteByPrimaryKey(mallKeywordVo.getId());
    }

    @Override
    public MallKeyword updateMallKeyword(MallKeyword mallKeyword) {
        mallKeywordMapper.updateByPrimaryKeySelective(mallKeyword);
        MallKeyword keyword = mallKeywordMapper.selectByPrimaryKey(mallKeyword.getId());
        return keyword;
    }

}
