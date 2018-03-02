package com.accp.biz;

import com.accp.entity.Class;

import java.util.List;

public interface ClassBiz {
    int insert(Class c);
    int update(Class c);
    int delete(Class c);
    Class get(Class c);
    List<Class> list(Class c);

}
