package com.example.recruit.config;

import com.example.recruit.interceptor.JWTInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 功能： 拦截器
 * 作者： bravekun
 * 日期： 2023/10/20 10:55
 */

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                .addPathPatterns("/**")     //拦截的路径
                .excludePathPatterns("/login");     //放行的路径
    }
}
