package com.mall4j.springboot.service.mallissue.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.mapper.mallissue.MallIssueMapper;
import com.mall4j.springboot.pojo.mallissue.IssuePageVo;
import com.mall4j.springboot.pojo.mallissue.MallIssue;
import com.mall4j.springboot.pojo.mallissue.MallIssueVo;
import com.mall4j.springboot.service.mallissue.MallIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 23:07
 * @Description:
 */

@Service
public class MallIssueServiceImpl implements MallIssueService {

    @Autowired
    MallIssueMapper mallIssueMapper;

    @Override
    public Map<String, Object> queryMallIssuePageList(IssuePageVo issuePageVo) {
        PageHelper.startPage(issuePageVo.getPage(), issuePageVo.getLimit());
        List<MallIssue> list = mallIssueMapper.queryMallIssuePageList(issuePageVo);
        PageInfo<MallIssue> page = new PageInfo<>(list);
        Map<String, Object> map = new HashMap<>(16);
        map.put("items", page.getList());
        map.put("total", page.getTotal());
        return map;
    }

    @Override
    public MallIssueVo createNewMallIssue(MallIssue mallIssue) {
        Date date = new Date();
        mallIssue.setAddTime(date);
        mallIssue.setUpdateTime(date);
        mallIssue.setDeleted(false);
        mallIssueMapper.createNewMallIssue(mallIssue);
        Integer id = mallIssue.getId();
        MallIssueVo mallIssueVo = mallIssueMapper.selectMallIssueVoById(id);
        return mallIssueVo;
    }

    @Override
    public MallIssueVo updateMallIssue(MallIssue mallIssue) {
        mallIssueMapper.updateByPrimaryKeySelective(mallIssue);
        MallIssueVo mallIssueVo = mallIssueMapper.selectMallIssueVoById(mallIssue.getId());
        return mallIssueVo;
    }

    @Override
    public void deleteMallIssue(MallIssue mallIssue) {
        mallIssueMapper.deleteByPrimaryKey(mallIssue.getId());
    }
}
