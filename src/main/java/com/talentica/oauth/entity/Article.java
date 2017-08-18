package com.talentica.oauth.entity;

import javax.persistence.*;

/**
 * Created by anubandhans on 14/08/17.
 */
@Entity
@Table(name="articles")
public class Article {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="article_id")
    private int articleId;
    @Column(name="title")
    private String title;
    @Column(name="category")
    private String category;
    public int getArticleId() {
        return articleId;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
