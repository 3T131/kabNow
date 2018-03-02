package com.accp.biz.impl;

import com.accp.biz.EducationBiz;
import com.accp.dao.EducationDao;
import com.accp.entity.Education;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EducationBizImpl implements EducationBiz {
    @Resource
    private EducationDao educationDao;
    public List<Education> list() {
        return educationDao.list();
    }
}
