package com.mall4j.springboot.controller.mallcategory;

import com.mall4j.springboot.pojo.common.ResponseVVo;
import com.mall4j.springboot.pojo.common.ResponseVo;
import com.mall4j.springboot.pojo.mallcategory.MallCategoryPrimary;
import com.mall4j.springboot.service.mallcategory.MallCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 17:50
 * @Description:
 */

@RestController
@RequestMapping("/category")
public class MallCategoryController {

    @Autowired
    MallCategoryService mallCategoryService;

    /**
     * 展示商品类目列表
     * @return
     */
    @RequestMapping("/list")
    public ResponseVo list() {
        List<MallCategoryPrimary> data = mallCategoryService.queryMallCategoryList();
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 删除指定商品类目
     * @param mallCategoryPrimary
     * @return
     */
    @RequestMapping("/delete")
    public ResponseVVo delete(@RequestBody MallCategoryPrimary mallCategoryPrimary) {
        mallCategoryService.deleteMallCategoryByPrimary(mallCategoryPrimary);
        ResponseVVo responseVVo = new ResponseVVo("成功", 0);
        return responseVVo;
    }
}
