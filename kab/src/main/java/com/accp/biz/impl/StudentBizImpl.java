package com.accp.biz.impl;

import com.accp.biz.StudentBiz;
import com.accp.dao.StudentDao;
import com.accp.entity.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentBizImpl implements StudentBiz {
    @Resource
    private StudentDao studentDao;
    public int insert(Student student) {
        return studentDao.insert(student);
    }

    public int update(Student student) {
        return studentDao.update(student);
    }

    public int delete(Student student) {
        return studentDao.delete(student);
    }

    public Student get(Student student) {
        return studentDao.get(student);
    }

    public List<Student> list(Student student) {
        return studentDao.list(student);
    }
}
