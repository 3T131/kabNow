package com.accp.biz.impl;

import com.accp.biz.SchoolBiz;
import com.accp.dao.SchoolDao;
import com.accp.entity.School;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SchoolBizImpl implements SchoolBiz {
    @Resource
    private SchoolDao schoolDao;
    public int insert(School school) {
        return schoolDao.insert(school);
    }

    public School get(School school) {
        return schoolDao.get(school);
    }

    public List<School> list(School school) {
        return schoolDao.list(school);
    }
}
