package com.talentica.oauth.function.uppercase;

import com.talentica.oauth.domain.UppercaseRequest;
import com.talentica.oauth.domain.UppercaseResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class UppercaseFunctionHandler extends SpringBootRequestHandler<UppercaseRequest, UppercaseResponse> {
}
