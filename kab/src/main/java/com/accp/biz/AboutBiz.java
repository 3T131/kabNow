package com.accp.biz;

import com.accp.entity.About;

public interface AboutBiz {
    //查询数据
    About getone(About about);
    //更改数据
    int modifyone(About about);
}
