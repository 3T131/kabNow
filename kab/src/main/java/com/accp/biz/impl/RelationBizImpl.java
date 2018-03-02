package com.accp.biz.impl;

import com.accp.biz.RelationBiz;
import com.accp.dao.RelationDao;
import com.accp.entity.Relation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("RelationBiz")
public class RelationBizImpl implements RelationBiz {
    @Resource
    private RelationDao relationDao;
    //查询一个
    public Relation getone(Relation relation) {
        return relationDao.getone(relation);
    }
    //修改
    public int modifyone(Relation relation) {
        return relationDao.modifyone(relation);
    }
}
