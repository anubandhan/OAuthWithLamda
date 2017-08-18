package com.talentica.oauth;

import com.talentica.oauth.domain.ArticleServiceRequest;
import com.talentica.oauth.domain.ArticleServiceResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class GetArticleFunctionHandler extends SpringBootRequestHandler<ArticleServiceRequest, ArticleServiceResponse> {
}
