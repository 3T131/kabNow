package com.accp.dao;

import com.accp.entity.Notice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NoticeDao {
    //查询一个
    Notice getone(Notice notice);
    //查询全部
    List<Notice> listNotice(Notice notice);
    //删除公告
    int deleteNotice(@Param("id") int id);
    //修改公告
    int modifyNotice(Notice notice);
    //新增公告
    int addNotice(Notice notice);
}
