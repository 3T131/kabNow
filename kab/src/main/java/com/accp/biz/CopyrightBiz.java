package com.accp.biz;

import com.accp.entity.Copyright;

public interface CopyrightBiz {
    //查询数据
    Copyright getone(Copyright copyright);
    //更改数据
    int modifyone(Copyright copyright);
}
