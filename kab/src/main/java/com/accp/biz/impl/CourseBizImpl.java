package com.accp.biz.impl;

import com.accp.biz.CourseBiz;
import com.accp.dao.CourseDao;
import com.accp.entity.Course;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("CourseBiz")
public class CourseBizImpl implements CourseBiz {
    @Resource
    private CourseDao courseDao;
    //修改
    public int modifyCourse(Course course) {
        return courseDao.modifyCourse(course);
    }
    //查询一个
    public Course getone(Course course) {
        return courseDao.getone(course);
    }
    //查询全部
    public List<Course> listCourse(Course course) {
        return courseDao.listCourse(course);
    }
    //删除
    public int deleteCourse(int id) {
        return courseDao.deleteCourse(id);
    }
    //新增
    public int addCourse(Course course) {
        return courseDao.addCourse(course);
    }
}
