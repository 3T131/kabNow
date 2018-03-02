package com.accp.biz.impl;

import com.accp.biz.NoticeBiz;
import com.accp.dao.NoticeDao;
import com.accp.entity.Notice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("NoticeBiz")
public class NoticeBizImpl implements NoticeBiz {
    @Resource
    private NoticeDao noticeDao;
    //查询一个
    public Notice getone(Notice notice) {
        return noticeDao.getone(notice);
    }
    //查询全部
    public List<Notice> listNotice(Notice notice) {
        return noticeDao.listNotice(notice);
    }
    //删除
    public int deleteNotice(int id) {
        return noticeDao.deleteNotice(id);
    }
    //修改
    public int modifyNotice(Notice notice) {
        return noticeDao.modifyNotice(notice);
    }
    //新增
    public int addNotice(Notice notice) {
        return noticeDao.addNotice(notice);
    }
}
