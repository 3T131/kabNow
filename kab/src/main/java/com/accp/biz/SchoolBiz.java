package com.accp.biz;

import com.accp.entity.School;

import java.util.List;

public interface SchoolBiz {
    int insert(School school);
    School get(School school);
    List<School> list(School school);
}
