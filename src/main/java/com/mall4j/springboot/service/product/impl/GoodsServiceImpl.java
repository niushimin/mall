package com.mall4j.springboot.service.product.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.MallGoodsMapper;
import com.mall4j.springboot.pojo.MallGoods;
import com.mall4j.springboot.pojo.MallGoodsExample;
import com.mall4j.springboot.service.product.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    MallGoodsMapper mallGoodsMapper;

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
}
