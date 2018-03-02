package com.accp.biz;

import com.accp.entity.UserStatus;

import java.util.List;

public interface UserStatusBiz {
    UserStatus get(UserStatus userStatus);
    List<UserStatus> list(UserStatus userStatus);
}
