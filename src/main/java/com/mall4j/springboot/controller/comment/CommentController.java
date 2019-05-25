package com.mall4j.springboot.controller.comment;

import com.mall4j.springboot.actionform.ReponseVoo;
import com.mall4j.springboot.actionform.RequestListParams;
import com.mall4j.springboot.pojo.MallComment;
import com.mall4j.springboot.pojo.common.ResponseVVo;
import com.mall4j.springboot.service.comment.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentServiceImpl commentService;
    /*返回评论列表*/
    @RequestMapping("/list")
    public ReponseVoo listComments(RequestListParams requestListParams, Integer userId, Integer valueId){
        ReponseVoo reponseVoo = commentService.listComments(requestListParams,userId,valueId);
        return reponseVoo;
    }
    /*删除评论*/
    @RequestMapping("/delete")
    public ReponseVoo deleteCommentById(@RequestBody MallComment mallComment){
        ReponseVoo reponseVoo = commentService.deleteCommentById(mallComment);
        return reponseVoo;
    }
}
