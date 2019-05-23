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
    public ReponseVoo getProductList(RequestListParams requestListParams) {
        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        List<MallGoods> mallGoods = mallGoodsMapper.selectByExample(new MallGoodsExample());
        PageInfo<MallGoods> mallGoodsPageInfo = new PageInfo<>(mallGoods);

        ReponsePage<MallGoods> reponsePage = new ReponsePage<>(mallGoods,mallGoodsPageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }
}
