package com.mall4j.springboot.service.product.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.actionform.product.ReponseBandAndCategory;
import com.mall4j.springboot.actionform.product.ReponseBrand;
import com.mall4j.springboot.actionform.product.ReponseCategory;

import com.mall4j.springboot.actionform.product.RequestGoods;
import com.mall4j.springboot.mapper.MallGoodsAttributeMapper;
import com.mall4j.springboot.mapper.MallGoodsMapper;
import com.mall4j.springboot.mapper.MallGoodsProductMapper;
import com.mall4j.springboot.mapper.MallGoodsSpecificationMapper;
import com.mall4j.springboot.mapper.mallbrand.MallBrandMapper;
import com.mall4j.springboot.mapper.mallcategory.MallCategoryMapper;

import com.mall4j.springboot.pojo.*;
import com.mall4j.springboot.service.product.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;
import java.util.Date;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    MallGoodsMapper mallGoodsMapper;
    @Autowired
    MallBrandMapper mallBrandMapper;
    @Autowired
    MallCategoryMapper mallCategoryMappper;
    @Autowired
    MallGoodsAttributeMapper mallGoodsAttributeMapper;
    @Autowired
    MallGoodsProductMapper mallGoodsProductMapper;
    @Autowired
    MallGoodsSpecificationMapper mallGoodsSpecificationMapper;

    @Override
    public ReponseVoo getProductList(RequestListParams requestListParams,String goodsSn,String name) {
        MallGoodsExample mallGoodsExample = new MallGoodsExample();
        MallGoodsExample.Criteria criteria = mallGoodsExample.createCriteria();
        criteria.andDeletedEqualTo(false);
        if(goodsSn != null && goodsSn.length() > 0){
            criteria.andGoodsSnEqualTo(goodsSn);
        }
        if(name != null && name.length() > 0){
            criteria.andNameLike("%" + name + "%");
        }

        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        List<MallGoods> mallGoods = mallGoodsMapper.selectByExampleWithBLOBs(mallGoodsExample);
        PageInfo<MallGoods> mallGoodsPageInfo = new PageInfo<>(mallGoods);

        ReponsePage<MallGoods> reponsePage = new ReponsePage<>(mallGoods,mallGoodsPageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }

    @Override
    public ReponseVoo deleteProductById(MallGoods mallGoods) {
        mallGoods.setDeleted(true);
        if (mallGoodsMapper.updateByPrimaryKey(mallGoods) != 0) {
            ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>();
            reponseVoo.setErrmsg("失败");
            return reponseVoo;
        } else {
            ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>();
            return reponseVoo;
        }
    }

    @Override
    public ReponseVoo getReponseBandAndCategory() {
        /*查询品牌*/
        List<ReponseBrand> reponseBrands = mallBrandMapper.selectBand();
        /*查询分类*/
        List<ReponseCategory> reponseCategories = mallCategoryMappper.selectCategory();

        ReponseBandAndCategory reponseBandAndCategory = new ReponseBandAndCategory(reponseBrands, reponseCategories);
        ReponseVoo<ReponseBandAndCategory> reponseVoo = new ReponseVoo<>(reponseBandAndCategory);

        return reponseVoo;
    }

    @Override
    public ReponseVoo insertGoods(RequestGoods requestGoods) {
        ReponseVoo reponseVoo = new ReponseVoo();

        MallGoods mallGoods = requestGoods.getGoods();
        List<MallGoodsAttribute> mallGoodsAttributes = requestGoods.getAttributes();
        List<MallGoodsProduct> mallGoodsProducts = requestGoods.getProducts();
        List<MallGoodsSpecification> mallGoodsSpecifications = requestGoods.getSpecifications();

        /*添加goods*/
        mallGoods.setId(Integer.parseInt(mallGoods.getGoodsSn()));
        mallGoods.setAddTime(new Date());
        mallGoods.setUpdateTime(new Date());
        mallGoods.setDeleted(false);
        if (mallGoodsMapper.insertSelective(mallGoods) == 0) {
            reponseVoo.setErrmsg("添加失败");
            return reponseVoo;
        }
        /*添加attribute*/
        for (MallGoodsAttribute mallGoodsAttribute : mallGoodsAttributes) {
            mallGoodsAttribute.setGoodsId(Integer.parseInt(mallGoods.getGoodsSn()));
            mallGoodsAttribute.setAddTime(new Date());
            mallGoodsAttribute.setUpdateTime(new Date());
            mallGoodsAttribute.setDeleted(false);
            mallGoodsAttributeMapper.insertSelective(mallGoodsAttribute);
        }
        /*添加product*/
        for (MallGoodsProduct mallGoodsProduct : mallGoodsProducts) {
            mallGoodsProduct.setGoodsId(Integer.parseInt(mallGoods.getGoodsSn()));
            mallGoodsProduct.setAddTime(new Date());
            mallGoodsProduct.setUpdateTime(new Date());
            mallGoodsProduct.setDeleted(false);
            mallGoodsProductMapper.insertSelective(mallGoodsProduct);
        }
        /*添加Specification*/
        for (MallGoodsSpecification mallGoodsSpecification : mallGoodsSpecifications) {
            mallGoodsSpecification.setGoodsId(Integer.parseInt(mallGoods.getGoodsSn()));
            mallGoodsSpecification.setAddTime(new Date());
            mallGoodsSpecification.setUpdateTime(new Date());
            mallGoodsSpecification.setDeleted(false);
            mallGoodsSpecificationMapper.insertSelective(mallGoodsSpecification);
        }
        return reponseVoo;
    }
}
