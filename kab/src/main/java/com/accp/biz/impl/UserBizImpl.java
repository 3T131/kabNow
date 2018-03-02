package com.accp.biz.impl;

import com.accp.biz.UserBiz;
import com.accp.dao.UserDao;
import com.accp.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserBizImpl implements UserBiz {
    @Resource
    private UserDao userDao;

    public int insert(User user) {
        return userDao.insert(user);
    }

    public int update(User user) {
        return userDao.update(user);
    }

    public int delete(User user) {
        return userDao.delete(user);
    }

    public User get(User user) {
        return userDao.get(user);
    }

    public List<User> list(User user) {
        return userDao.list(user);
    }
}
