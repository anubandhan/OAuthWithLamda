package com.talentica.oauth.function.lowercase;

import com.talentica.oauth.domain.UppercaseRequest;
import com.talentica.oauth.domain.UppercaseResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

/**
 * Created by anubandhans on 17/08/17.
 */
public class LowercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {
}
