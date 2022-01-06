package com.github.paulopcrp.mywine.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String BASE_PACKAGE = "com.github.paulopcrp.mywine.controller;";
    private static final String API_TITLE = "Wine Stock API";
    private static final String API_DESCRIPTION = "REST API for wine stock management";
    private static final String CONTACT_NAME = "Paulo Cesar Rodrigues";
    private static final String CONTACT_GITHUB = "https://github.com/paulopcrp";
    private static final String CONTACT_EMAIL = "paulo.pcrp@gmail.com";


}
