package com.accp.biz.impl;

import com.accp.biz.NoticeLevelBiz;
import com.accp.dao.NoticeLevelDao;
import com.accp.entity.NoticeLevel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("NoticeLevelBiz")
public class NoticeLevelBizImpl implements NoticeLevelBiz {
@Resource
    private NoticeLevelDao noticeLevelDao;
    //查询全部
    public List<NoticeLevel> listLevel(NoticeLevel noticeLevel) {
        return noticeLevelDao.listLevel(noticeLevel);
    }
    //修改等级
    public int modifyLevel(NoticeLevel noticeLevel) {
        return noticeLevelDao.modifyLevel(noticeLevel);
    }
}
