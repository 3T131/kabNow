package com.accp.dao;
import com.accp.entity.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsDao {
    //查询一个
    News getone(News news);
    //查询全部
    List<News> listNews(News news);
    //删除公告
    int deleteNews(@Param("id") int id);
    //修改公告
    int modifyNews(News news);
    //新增公告
    int addNews(News news);
}
