package com.accp.biz.impl;

import com.accp.biz.NewsBiz;
import com.accp.dao.NewsDao;
import com.accp.entity.News;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("NewsBiz")
public class NewsBizImpl implements NewsBiz {
    @Resource
    private NewsDao newsDao;
    //查询一个
    public News getone(News news) {
        return newsDao.getone(news);
    }
    //查询全部
    public List<News> listNews(News news) {
        return newsDao.listNews(news);
    }
    //删除
    public int deleteNews(int id) {
        return newsDao.deleteNews(id);
    }
    //修改
    public int modifyNews(News news) {
        return newsDao.modifyNews(news);
    }
    //新增
    public int addNews(News news) {
        return newsDao.addNews(news);
    }
}
