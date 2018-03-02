package com.accp.biz.impl;

import com.accp.biz.CopyrightBiz;
import com.accp.dao.CopyrightDao;
import com.accp.entity.Copyright;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("CopyrightBiz")
public class CopyrightBizImpl implements CopyrightBiz {
    @Resource
    private CopyrightDao copyrightDao;
    //查询数据
    public Copyright getone(Copyright copyright) {
        return copyrightDao.getone(copyright);
    }
    //更改数据
    public int modifyone(Copyright copyright) {
        return copyrightDao.modifyone(copyright);
    }
}
