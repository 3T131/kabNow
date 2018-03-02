package com.accp.biz.impl;

import com.accp.biz.InformationBiz;
import com.accp.dao.InformationDao;
import com.accp.entity.Information;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("InformationBiz")
public class InformationBizImpl implements InformationBiz {
    @Resource
    private InformationDao informationDao;
    //修改
    public Information getone(Information information) {
        return informationDao.getone(information);
    }
    //查询一个
    public List<Information> listInformation(Information information) {
        return informationDao.listInformation(information);
    }
    //查询全部
    public int deleteInformation(int id) {
        return informationDao.deleteInformation(id);
    }
    //删除
    public int modifyInformation(Information information) {
        return informationDao.modifyInformation(information);
    }
    //新增
    public int addInformation(Information information) {
        return informationDao.addInformation(information);
    }
}
