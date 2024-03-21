package com.multitenancy.config;

import com.multitenancy.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    public void addInterceptor(InterceptorRegistry interceptorRegistry){
        interceptorRegistry.addInterceptor(new RequestInterceptor());
    }

}
