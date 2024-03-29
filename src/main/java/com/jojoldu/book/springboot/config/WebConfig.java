package com.jojoldu.book.springboot.config;

import com.jojoldu.book.springboot.config.auth.LoginUserArgumentResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class WebConfig implements WebMvcConfigurer {
    private final LoginUserArgumentResolver loginUserArgumentResolver;

    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolverList) {
        argumentResolverList.add(loginUserArgumentResolver);
    }
}
