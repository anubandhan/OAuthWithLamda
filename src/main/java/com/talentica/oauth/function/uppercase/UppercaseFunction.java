package com.talentica.oauth.function.uppercase;

import com.talentica.oauth.domain.UppercaseRequest;
import com.talentica.oauth.domain.UppercaseResponse;
import com.talentica.oauth.entity.Article;
import com.talentica.oauth.service.ArticleService;
import com.talentica.oauth.service.UppercaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("uppercaseFunction")
public class UppercaseFunction implements Function<UppercaseRequest, UppercaseResponse> {

    @Autowired
    private final ArticleService articleService;

    static final Logger log = Logger.getLogger(UppercaseService.class);

    public UppercaseFunction(final ArticleService articleService) {
        log.debug("UppercaseFunction --> articleService initialised ");
        this.articleService = articleService;
    }

    @Override
    public UppercaseResponse apply(final UppercaseRequest uppercaseRequest) {
        final UppercaseResponse result = new UppercaseResponse();

        log.info("Input for Get Article ID is :"+ Integer.valueOf(uppercaseRequest.getInput()));

        Article article = articleService.getArticleById(Integer.valueOf(uppercaseRequest.getInput()));
        result.setResult(article.getTitle());
        return result;
    }
}
