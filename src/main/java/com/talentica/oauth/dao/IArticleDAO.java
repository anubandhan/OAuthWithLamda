package com.talentica.oauth.dao;

import com.talentica.oauth.entity.Article;

import java.util.List;

/**
 * Created by anubandhans on 14/08/17.
 */
public interface IArticleDAO {
    List<Article> getAllArticles();
    Article getArticleById(int articleId);
    void addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
    boolean articleExists(String title, String category);
}
