package com.accp.biz;

import com.accp.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseBiz {
    //修改公告
    int modifyCourse(Course course);
    //查询一个
    Course getone(Course course);
    //查询全部
    List<Course> listCourse(Course course);
    //删除公告
    int deleteCourse(@Param("id") int id);
    //新增公告
    int addCourse(Course course);
}
