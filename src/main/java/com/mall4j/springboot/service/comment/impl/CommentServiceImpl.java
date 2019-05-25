package com.mall4j.springboot.service.comment.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall4j.springboot.actionform.ReponsePage;
import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.mapper.MallCommentMapper;
import com.mall4j.springboot.pojo.MallComment;
import com.mall4j.springboot.pojo.MallCommentExample;
import com.mall4j.springboot.service.comment.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    MallCommentMapper mallCommentMapper;
    @Override
    public ReponseVoo listComments(RequestListParams requestListParams, Integer userId, Integer valueId) {
        MallCommentExample mallCommentExample = new MallCommentExample();
        MallCommentExample.Criteria criteria = mallCommentExample.createCriteria();
        criteria.andDeletedEqualTo(false);

        if (userId != null) {
            criteria.andUserIdEqualTo(userId);
        }
        if (valueId != null) {
            criteria.andValueIdEqualTo(valueId);
        }

        PageHelper.startPage(requestListParams.getPage(),requestListParams.getLimit());
        List<MallComment> mallComments = mallCommentMapper.selectByExample(mallCommentExample);
        PageInfo<MallComment> mallCommentPageInfo = new PageInfo<>(mallComments);

        ReponsePage<MallComment> reponsePage = new ReponsePage<>(mallComments,mallCommentPageInfo.getTotal());
        ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>(reponsePage);
        return reponseVoo;
    }

    @Override
    public ReponseVoo deleteCommentById(MallComment mallComment) {
        mallComment.setDeleted(true);
        if (mallCommentMapper.updateByPrimaryKey(mallComment) != 0) {
            ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>();
            reponseVoo.setErrmsg("失败");
            return reponseVoo;
        } else {
            ReponseVoo<ReponsePage> reponseVoo = new ReponseVoo<>();
            return reponseVoo;
        }
    }
}
