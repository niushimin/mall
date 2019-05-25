package com.mall4j.springboot.service.comment;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallComment;

public interface CommentService {
    ReponseVoo listComments(RequestListParams requestListParams, Integer userId, Integer valueId);

    ReponseVoo deleteCommentById(MallComment mallComment);
}
