package com.mall4j.springboot.service.impl;

import com.mall4j.springboot.mapper.MallAdminMapper;
import com.mall4j.springboot.pojo.MallAdmin;
import com.mall4j.springboot.pojo.MallAdminExample;
import com.mall4j.springboot.pojo.MallAdminVo;
import com.mall4j.springboot.service.MallAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Ethan New
 * @Date: 2019/5/22 19:44
 * @Description:
 */

@Service
public class MallAdminServiceImpl implements MallAdminService {

    @Autowired
    MallAdminMapper mallAdminMapper;

    @Override
    public boolean login(MallAdminVo mallAdminVo) {
        MallAdminExample mallAdminExample = new MallAdminExample();
        MallAdminExample.Criteria criteria = mallAdminExample.createCriteria();
        criteria.andUsernameEqualTo(mallAdminVo.getUsername()).andPasswordEqualTo(mallAdminVo.getPassword());
        List<MallAdmin> mallAdmins = mallAdminMapper.selectByExample(mallAdminExample);
        return mallAdmins != null;
    }
}
