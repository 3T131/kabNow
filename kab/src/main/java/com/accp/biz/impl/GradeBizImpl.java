package com.accp.biz.impl;

import com.accp.biz.GradeBiz;
import com.accp.dao.GradeDao;
import com.accp.entity.Grade;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GradeBizImpl implements GradeBiz {
    @Resource
    private GradeDao gradeDao;
    public List<Grade> list() {
        return gradeDao.list();
    }
}
