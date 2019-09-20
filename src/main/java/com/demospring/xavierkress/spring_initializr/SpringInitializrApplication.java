package com.demospring.xavierkress.spring_initializr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringInitializrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInitializrApplication.class, args);
    }

}
