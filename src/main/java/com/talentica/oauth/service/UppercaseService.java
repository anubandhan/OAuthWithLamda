package com.talentica.oauth.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UppercaseService {
    static final Logger log = Logger.getLogger(UppercaseService.class);


    public String uppercase(final String input) {
        System.out.println("Input" + input);
        return input.toUpperCase(Locale.ENGLISH);
    }

    public String lowercase(final String input) {
        System.out.println("Input" + input);
        return input.toLowerCase(Locale.ENGLISH);
    }

}
