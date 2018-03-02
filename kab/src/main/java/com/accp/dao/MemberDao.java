package com.accp.dao;

import com.accp.entity.Member;

import java.util.List;

public interface MemberDao {
    int insert(Member member);
    int update(Member member);
    int delete(Member member);
    Member get(Member member);
    List<Member> list(Member member);
}
