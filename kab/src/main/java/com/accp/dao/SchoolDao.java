package com.accp.dao;

import com.accp.entity.School;

import java.util.List;

public interface SchoolDao {
    int insert(School school);
    School get(School school);
    List<School> list(School school);
}
