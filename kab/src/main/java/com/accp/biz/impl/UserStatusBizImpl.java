package com.accp.biz.impl;

import com.accp.biz.UserStatusBiz;
import com.accp.dao.UserStatusDao;
import com.accp.entity.UserStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserStatusBizImpl implements UserStatusBiz {

    @Resource
    private UserStatusDao userStatusDao;

    public UserStatus get(UserStatus userStatus) {
        return userStatusDao.get(userStatus);
    }

    public List<UserStatus> list(UserStatus userStatus) {
        return userStatusDao.list(userStatus);
    }
}
