package com.talentica.oauth.service;


import com.talentica.oauth.entity.Article;

import java.util.List;

/**
 * Created by anubandhans on 14/08/17.
 */

public interface IArticleService {
    List<Article> getAllArticles();
    Article getArticleById(final Integer articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
}