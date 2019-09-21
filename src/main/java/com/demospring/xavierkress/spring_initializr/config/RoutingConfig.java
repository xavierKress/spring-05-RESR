package com.demospring.xavierkress.spring_initializr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class routingConfig implements WebMvcConfigurer {


    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/securedPage").setViewName("securedPage");
        registry.addViewController("/securedAdminPage").setViewName("securedAdminPage");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
    }

}

