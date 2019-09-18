package com.sdsoon.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created By Chr on 2019/8/13.
 */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    //添加到容器中管理:解决跨域OPTION请求
//    配置过滤器，实现 WebMvcConfigurer接口（springboot2.x的方式）
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*");
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        //???
//        config.addExposedHeader("*");
        config.setMaxAge(3600L);
        config.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);

        return new CorsFilter(configSource);
    }


    //配置拦截器，继承WebMvcConfigurerAdapter类（1.x的方式，在2.x已经过时）
/*
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //                registry.addMapping("/**");
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
//                .allowedHeaders("Content-Type, x-requested-with, X-Custom-Header, Authorization","token")
                .allowedMethods("*")
//                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }
    */

    // 支持跨域访问
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**").maxAge(3600).allowedHeaders("Content-Type, x-requested-with, X-Custom-Header, Authorization");
//    }

    // 支持PUT请求
//    @Bean
//    public HttpPutFormContentFilter httpPutFormContentFilter() {
//        return new HttpPutFormContentFilter();
//    }

}
