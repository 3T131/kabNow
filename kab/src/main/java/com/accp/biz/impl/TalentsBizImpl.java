package com.accp.biz.impl;

import com.accp.biz.TalentsBiz;
import com.accp.dao.TalentsDao;
import com.accp.entity.Talents;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("TalentsBiz")
public class TalentsBizImpl implements TalentsBiz {
    @Resource
    private TalentsDao talentsDao;
    //查询一个
    public Talents getone(Talents talents) {
        return talentsDao.getone(talents);
    }
    //修改一个
    public int modifyone(Talents talents) {
        return talentsDao.modifyone(talents);
    }
}
