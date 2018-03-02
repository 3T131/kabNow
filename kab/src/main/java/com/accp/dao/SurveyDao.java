package com.accp.dao;

import com.accp.entity.Survey;

public interface SurveyDao {
    //查询数据
    Survey getone(Survey survey);
    //更改数据
    int modifyone(Survey survey);
}
