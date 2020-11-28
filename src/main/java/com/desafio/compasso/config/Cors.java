package com.desafio.compasso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration

public class Cors {

    private static final String ALLOWED_ORIGINS = "*";
    private static final String ALLOWED_HEADERS = "*";

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins(ALLOWED_ORIGINS)
                        .allowedHeaders(ALLOWED_HEADERS)
                        .allowedMethods("GET", "POST", "PUT", "DELETE");
            }
        };
    }
}
