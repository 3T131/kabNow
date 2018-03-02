package com.accp.biz.impl;

import com.accp.biz.ClassBiz;
import com.accp.dao.ClassDao;
import com.accp.entity.Class;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassBizImpl implements ClassBiz {
    @Resource
    private ClassDao classDao;

    /**
     * 新增班级
     * @param c
     * @return
     */
    public int insert(Class c) {
        return classDao.insert(c);
    }

    public int update(Class c) {
        return classDao.update(c);
    }


    public int delete(Class c) {
        return classDao.delete(c);
    }

    public Class get(Class c) {
        return classDao.get(c);
    }

    public List<Class> list(Class c) {
        return classDao.list(c);
    }
}
