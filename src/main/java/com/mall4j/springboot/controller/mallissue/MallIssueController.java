package com.mall4j.springboot.controller.mallissue;

import com.mall4j.springboot.pojo.common.ResponseVVo;
import com.mall4j.springboot.pojo.common.ResponseVo;
import com.mall4j.springboot.pojo.mallissue.IssuePageVo;
import com.mall4j.springboot.pojo.mallissue.MallIssue;
import com.mall4j.springboot.pojo.mallissue.MallIssueVo;
import com.mall4j.springboot.pojo.mallkeyword.KeywordPageVo;
import com.mall4j.springboot.pojo.mallkeyword.MallKeyword;
import com.mall4j.springboot.pojo.mallkeyword.MallKeywordVo;
import com.mall4j.springboot.service.mallissue.MallIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 23:01
 * @Description:
 */

@RestController
@RequestMapping("/admin/issue")
public class MallIssueController {

    @Autowired
    MallIssueService mallIssueService;

    /**
     * 展示通用问题列表
     * @param issuePageVo
     * @return
     */
    @RequestMapping("/list")
    public ResponseVo list(IssuePageVo issuePageVo) {
        Map<String, Object> data = mallIssueService.queryMallIssuePageList(issuePageVo);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 新增通用问题信息
     * @param mallIssue
     * @return
     */
    @RequestMapping("/create")
    public ResponseVo create(@RequestBody MallIssue mallIssue) {
        MallIssueVo data = mallIssueService.createNewMallIssue(mallIssue);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 更新通用问题信息
     * @param mallIssue
     * @return
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody MallIssue mallIssue) {
        MallIssueVo data = mallIssueService.updateMallIssue(mallIssue);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 删除通用问题信息
     * @param mallIssue
     * @return
     */
    @RequestMapping("/delete")
    public ResponseVVo delete(@RequestBody MallIssue mallIssue) {
        mallIssueService.deleteMallIssue(mallIssue);
        ResponseVVo responseVVo = new ResponseVVo("成功", 0);
        return responseVVo;
    }
}
