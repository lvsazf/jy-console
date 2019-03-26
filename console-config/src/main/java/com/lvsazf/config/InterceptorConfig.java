package com.lvsazf.config;

import com.lvsazf.interceptor.ResponseResultInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 路智顺
 * @Description
 * @date 13:37 2019-01-08
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private ResponseResultInterceptor responseResultInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(responseResultInterceptor).addPathPatterns("/**");
    }
}
