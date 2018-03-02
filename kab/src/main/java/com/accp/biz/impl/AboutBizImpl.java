package com.accp.biz.impl;

import com.accp.biz.AboutBiz;
import com.accp.dao.AboutDao;
import com.accp.entity.About;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("AboutBiz")
public class AboutBizImpl implements AboutBiz {
    @Resource
    private AboutDao aboutDao;
    //查询数据
    public About getone(About about) {
        return aboutDao.getone(about);
    }
    //更改数据
    public int modifyone(About about) {
        return aboutDao.modifyone(about);
    }
}
