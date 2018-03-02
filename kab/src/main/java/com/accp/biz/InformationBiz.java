package com.accp.biz;

import com.accp.entity.Information;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InformationBiz {
    //查询一个
    Information getone(Information information);
    //查询全部
    List<Information> listInformation(Information information);
    //删除公告
    int deleteInformation(@Param("id") int id);
    //修改公告
    int modifyInformation(Information information);
    //新增公告
    int addInformation(Information information);
}
