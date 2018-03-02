package com.accp.biz;

import com.accp.entity.User;

import java.util.List;

public interface UserBiz {
    int insert(User user);
    int update(User user);
    int delete(User user);
    User get(User user);
    List<User> list(User user);
}
