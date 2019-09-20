package com.demospring.xavierkress.spring_initializr.aspects;

import com.demospring.xavierkress.spring_initializr.controllers.BookController;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookControllerAspect {

    @Before(value = "execution(* com.demospring.xavierkress.spring_initializr.controllers.BookController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method:" + joinPoint.getSignature());
    }

    @After(value = "execution(* com.demospring.xavierkress.spring_initializr.controllers.BookController.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("After method:" + joinPoint.getSignature());
        BookController bc = (BookController) joinPoint.getTarget();
        System.out.println(bc.toString());
    }
}

