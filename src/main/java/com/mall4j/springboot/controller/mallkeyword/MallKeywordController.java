package com.mall4j.springboot.controller.mallkeyword;

import com.mall4j.springboot.pojo.common.ResponseVVo;
import com.mall4j.springboot.pojo.common.ResponseVo;
import com.mall4j.springboot.pojo.mallkeyword.KeywordPageVo;
import com.mall4j.springboot.pojo.mallkeyword.MallKeyword;
import com.mall4j.springboot.pojo.mallkeyword.MallKeywordVo;
import com.mall4j.springboot.service.mallkeyword.MallKeywordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 19:33
 * @Description:
 */

@RestController
@RequestMapping("/admin/keyword")
public class MallKeywordController {

    @Autowired
    MallKeywordService mallKeywordService;

    /**
     * 展示关键词列表
     * @param keywordPageVo
     * @return
     */
    @RequestMapping("/list")
    public ResponseVo list(KeywordPageVo keywordPageVo) {
        Map<String, Object> data = mallKeywordService.queryMallKeywordPageList(keywordPageVo);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 新增关键词信息
     * @param mallKeyword
     * @return
     */
    @RequestMapping("/create")
    public ResponseVo create(@RequestBody MallKeyword mallKeyword) {
        MallKeywordVo data = mallKeywordService.createNewMallKeyword(mallKeyword);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 更新关键词信息
     * @param mallKeyword
     * @return
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody MallKeyword mallKeyword) {
        MallKeyword data = mallKeywordService.updateMallKeyword(mallKeyword);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 删除关键词信息
     * @param mallKeywordVo
     * @return
     */
    @RequestMapping("/delete")
    public ResponseVVo delete(@RequestBody MallKeywordVo mallKeywordVo) {
        mallKeywordService.deleteMallKeyword(mallKeywordVo);
        ResponseVVo responseVVo = new ResponseVVo("成功", 0);
        return responseVVo;
    }
}
