package com.myblog.version3.service.impl;

import com.myblog.version3.entity.Article;
import com.myblog.version3.mapper.articleMapper;
import com.myblog.version3.service.articleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements articleService {

    @Autowired
    articleMapper mapper;

    @Override
    public Article getByID(String ID) {
        return mapper.getByID(ID);
    }

    @Override
    public List<Article> getByUid(String Uid) {
        return mapper.getByUid(Uid);
    }

    @Override
    public List<Article> getAll() {
        return mapper.getAll();
    }

    @Override
    public Boolean Insert(Article article) {
        return mapper.insert(article);
    }

    @Override
    public Boolean status(Integer status, String ID) {
        return mapper.status(status,ID);
    }

    @Override
    public Boolean commentStatus(Integer comment, String ID) {
        return mapper.commentStatus(comment ,ID);
    }

    @Override
    public Boolean hit(String ID) {
        return mapper.hit(ID);
    }
}
