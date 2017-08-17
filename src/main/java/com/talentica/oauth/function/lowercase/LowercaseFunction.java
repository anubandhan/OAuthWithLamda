package com.talentica.oauth.function.lowercase;

import com.talentica.oauth.domain.UppercaseRequest;
import com.talentica.oauth.domain.UppercaseResponse;
import com.talentica.oauth.service.UppercaseService;
import org.springframework.stereotype.Component;

import java.util.function.Function;

/**
 * Created by anubandhans on 12/08/17.
 */
@Component
public class LowercaseFunction implements Function<UppercaseRequest, UppercaseResponse> {

    private UppercaseService uppercaseService;

    public LowercaseFunction(final UppercaseService uppercaseService){
        this.uppercaseService = uppercaseService;
    }

    @Override
    public UppercaseResponse apply(UppercaseRequest uppercaseRequest) {

        final UppercaseResponse result = new UppercaseResponse();
        result.setResult(uppercaseService.lowercase(uppercaseRequest.getInput()));
        return result;
    }
}
