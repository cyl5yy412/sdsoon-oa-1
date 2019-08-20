package com.sdsoon.config;

import com.sdsoon.core.auth.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 中台拦截器
 * <p>
 * Created By Chr on 2019/7/19.
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/daily/**")    // 拦截中台请求
//                .excludePathPatterns(
//                        //swagger
//                        "/swagger-resources/**",
//                        "/webjars/**",
//                        //"/v2/**",
//                        "/swagger-ui.html/**",
//                        //登陆注册页
//                        "/login",
//                        "/**/index.html/**",
//                        "/**/login.html/**",
//                        "/**/register.html/**",
//                        //user
//                        "/v1/user/login",
//                        "/v1/user/register",
//                        "/v1/user/check",
//                        //daily
//                        "/daily/**",
//                        //页面
//                        "static/**", "/index", "/**/*.css", "/**/*.js", "/**/*.png ", "/**/*.jpg", "/**/*.jpeg ", "/**/**.html"
//                        ,
//                        "/users",
//                        "/user/**",
//                        "/roles",
//                        "/role/**",
//                        "/perms",
//                        "/role/**"


//                )
        //
        ;

    }

}
