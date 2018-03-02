package com.accp.biz;

import com.accp.entity.Student;

import java.util.List;

public interface StudentBiz {
    int insert(Student student);
    int update(Student student);
    int delete(Student student);
    Student get(Student student);
    List<Student> list(Student student);
}
