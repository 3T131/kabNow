package com.accp.biz;

import com.accp.entity.NewsComment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsCommentBiz {
    //查询全部
    List<NewsComment> listNewsComment(NewsComment newsComment);
    //删除公告
    int deleteNewsComment(@Param("id") int id);
    //修改公告
    int modifyNewsComment(NewsComment newsComment);
    //新增公告
    int addNewsComment(NewsComment newsComment);
}
