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
import com.mall4j.springboot.mapper.MallBrandMapper;
import com.mall4j.springboot.mapper.MallCategoryMapper;
import com.mall4j.springboot.mapper.MallGoodsMapper;
import com.mall4j.springboot.pojo.MallBrandExample;
import com.mall4j.springboot.pojo.MallCategory;
import com.mall4j.springboot.pojo.MallGoods;
import com.mall4j.springboot.pojo.MallGoodsExample;
import com.mall4j.springboot.service.product.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    MallGoodsMapper mallGoodsMapper;
    @Autowired
    MallBrandMapper mallBrandMapper;
    @Autowired
    MallCategoryMapper mallCategoryMappper;

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
}
