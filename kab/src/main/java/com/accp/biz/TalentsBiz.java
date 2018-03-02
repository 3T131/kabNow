package com.accp.biz;

import com.accp.entity.Talents;

public interface TalentsBiz {
    //查询数据
    Talents getone(Talents talents);
    //更改数据
    int modifyone(Talents talents);
}
