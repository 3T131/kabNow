package com.accp.biz.impl;

import com.accp.biz.SurveyBiz;
import com.accp.dao.SurveyDao;
import com.accp.entity.Survey;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("SurveyBiz")
public class SurveyBizImpl implements SurveyBiz {
    @Resource
    private SurveyDao surveyDao;
    //查询一个
    public Survey getone(Survey survey) {
        return surveyDao.getone(survey);
    }
    //修改一个
    public int modifyone(Survey survey) {
        return surveyDao.modifyone(survey);
    }
}
