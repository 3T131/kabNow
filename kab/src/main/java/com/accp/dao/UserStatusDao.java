package com.accp.dao;

import com.accp.entity.UserStatus;

import java.util.List;

public interface UserStatusDao {
    UserStatus get(UserStatus userStatus);
    List<UserStatus> list(UserStatus userStatus);
}
