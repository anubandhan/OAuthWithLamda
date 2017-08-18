package com.talentica.oauth;

import com.talentica.oauth.domain.ArticleServiceRequest;
import com.talentica.oauth.domain.ArticleServiceResponse;
import com.talentica.oauth.entity.Article;
import com.talentica.oauth.service.ArticleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("uppercaseFunction")
public class GetArticleFunction implements Function<ArticleServiceRequest, ArticleServiceResponse> {

    @Autowired
    private final ArticleService articleService;

    static final Logger log = Logger.getLogger(GetArticleFunction.class);

    public GetArticleFunction(final ArticleService articleService) {
        log.debug("GetArticleFunction --> articleService initialised ");
        this.articleService = articleService;
    }

    @Override
    public ArticleServiceResponse apply(final ArticleServiceRequest articleServiceRequest) {
        final ArticleServiceResponse result = new ArticleServiceResponse();

        log.info("Input for Get Article ID is :"+ Integer.valueOf(articleServiceRequest.getInput()));

        Article article = articleService.getArticleById(Integer.valueOf(articleServiceRequest.getInput()));
        result.setResult(article.getTitle());
        return result;
    }
}
