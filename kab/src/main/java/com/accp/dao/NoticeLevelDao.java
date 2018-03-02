package com.accp.dao;

import com.accp.entity.NoticeLevel;

import java.util.List;

public interface NoticeLevelDao {
    //查询公告等级
    List<NoticeLevel> listLevel(NoticeLevel noticeLevel);
    //更改公告等级
    int modifyLevel(NoticeLevel noticeLevel);

}
