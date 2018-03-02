package com.accp.biz.impl;

import com.accp.biz.NewsCommentBiz;
import com.accp.dao.NewsCommentDao;
import com.accp.entity.NewsComment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("NewsCommentBiz")
public class NewsCommentBizImpl implements NewsCommentBiz {
    @Resource
    private NewsCommentDao newsCommentDao;
    //查询全部
    public List<NewsComment> listNewsComment(NewsComment newsComment) {
        return newsCommentDao.listNewsComment(newsComment);
    }
    //删除
    public int deleteNewsComment(int id) {
        return newsCommentDao.deleteNewsComment(id);
    }
    //修改
    public int modifyNewsComment(NewsComment newsComment) {
        return newsCommentDao.modifyNewsComment(newsComment);
    }
    //新增
    public int addNewsComment(NewsComment newsComment) {
        return newsCommentDao.addNewsComment(newsComment);
    }
}
