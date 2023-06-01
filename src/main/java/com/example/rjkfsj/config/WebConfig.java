package com.example.rjkfsj.config;

import com.example.rjkfsj.intercepter.LoginIntercepter;
import org.aopalliance.intercept.Interceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  //springboot 自动读取这个类 该方法才能生效
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){  //addInterceptors增加拦截器
        registry.addInterceptor(new LoginIntercepter()).addPathPatterns("/user/**");    //"/user/**"是拦截路径
    }
}
