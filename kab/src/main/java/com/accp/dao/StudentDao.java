package com.accp.dao;

import com.accp.entity.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);
    int update(Student student);
    int delete(Student student);
    Student get(Student student);
    List<Student> list(Student student);
}
