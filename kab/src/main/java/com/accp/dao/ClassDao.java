package com.accp.dao;

import com.accp.entity.Class;

import java.util.List;

public interface ClassDao {
    int insert(Class c);
    int update(Class c);
    int delete(Class c);
    Class get(Class c);
    List<Class> list(Class c);
}
