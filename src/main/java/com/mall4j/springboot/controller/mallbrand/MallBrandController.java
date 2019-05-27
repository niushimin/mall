package com.mall4j.springboot.controller.mallbrand;

import com.mall4j.springboot.pojo.common.ResponseVVo;
import com.mall4j.springboot.pojo.mallbrand.BrandPageVo;
import com.mall4j.springboot.pojo.common.ResponseVo;
import com.mall4j.springboot.pojo.mallbrand.MallBrand;
import com.mall4j.springboot.pojo.mallbrand.MallBrandVo;
import com.mall4j.springboot.service.mallbrand.MallBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: Ethan New
 * @Date: 2019/5/23 14:20
 * @Description:
 */

@RestController
@RequestMapping("/admin/brand")
public class MallBrandController {

    @Autowired
    MallBrandService mallBrandService;

    /**
     * 展示品牌制造商列表信息
     * @param requestPageVo
     * @return
     */
    @RequestMapping("/list")
    public ResponseVo list(BrandPageVo requestPageVo) {
        Map<String, Object> data = mallBrandService.queryMallBrandPageList(requestPageVo);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 新增品牌制造商信息
     * @param mallBrand
     * @return
     */
    @RequestMapping("/create")
    public ResponseVo create(@RequestBody MallBrand mallBrand) {
        MallBrandVo data = mallBrandService.createNewMallBrand(mallBrand);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 更新品牌制造商信息
     * @param mallBrand
     * @return
     */
    @RequestMapping("/update")
    public ResponseVo update(@RequestBody MallBrand mallBrand) {
        MallBrand data = mallBrandService.updateMallBrand(mallBrand);
        ResponseVo responseVo = new ResponseVo(data, "成功", 0);
        return responseVo;
    }

    /**
     * 删除品牌制造商信息
     * @param mallBrand
     * @return
     */
    @RequestMapping("/delete")
    public ResponseVVo delete(@RequestBody MallBrand mallBrand) {
        mallBrandService.deleteMallBrand(mallBrand);
        ResponseVVo responseVVo = new ResponseVVo("成功", 0);
        return responseVVo;
    }
}
