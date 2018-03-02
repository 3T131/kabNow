package com.accp.dao;

import com.accp.entity.Relation;

public interface RelationDao {
    //查询数据
    Relation getone(Relation relation);
    //更改数据
    int modifyone(Relation relation);
}
