package com.mall4j.springboot.service.mallissue;

import com.mall4j.springboot.pojo.mallissue.IssuePageVo;
import com.mall4j.springboot.pojo.mallissue.MallIssue;
import com.mall4j.springboot.pojo.mallissue.MallIssueVo;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 23:07
 * @Description:
 */
public interface MallIssueService {

    Map<String, Object> queryMallIssuePageList(IssuePageVo issuePageVo);

    MallIssueVo createNewMallIssue(MallIssue mallIssue);

    MallIssueVo updateMallIssue(MallIssue mallIssue);

    void deleteMallIssue(MallIssue mallIssue);

}
