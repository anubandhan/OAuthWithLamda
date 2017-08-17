package com.talentica.oauth.service;

import com.talentica.oauth.dao.ArticleDAO;
import com.talentica.oauth.dao.IArticleDAO;
import com.talentica.oauth.entity.Article;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by anubandhans on 14/08/17.
 */

@Service("articleService")
public class ArticleService implements IArticleService {

    static final Logger log = Logger.getLogger(UppercaseService.class);

    @Autowired
    private IArticleDAO articleDAO;

    public ArticleService(final ArticleDAO articleDAO) {
        log.debug("ArticleService --> articleDAO initialised ");
        this.articleDAO = articleDAO;
    }

    @Override
    public Article getArticleById(final Integer articleId) {
        log.debug("log data from log4j debug \n this is continuation of log4j debug");
        log.debug("Article data as per request ::" + articleId);
        Article obj = articleDAO.getArticleById(articleId);
        return obj;
    }
    @Override
    public List<Article> getAllArticles(){
        return articleDAO.getAllArticles();
    }
    @Override
    public synchronized boolean addArticle(Article article){
        if (articleDAO.articleExists(article.getTitle(), article.getCategory())) {
            log.debug("Article already exists ::" + article.getTitle());
            return false;
        } else {
            articleDAO.addArticle(article);
            log.debug("Article added to DB ::" + article.getTitle());
            return true;
        }
    }
    @Override
    public void updateArticle(Article article) {
        articleDAO.updateArticle(article);
    }
    @Override
    public void deleteArticle(int articleId) {
        articleDAO.deleteArticle(articleId);
    }
}
