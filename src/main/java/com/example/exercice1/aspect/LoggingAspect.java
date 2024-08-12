package com.example.exercice1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.exercice1.service.BookService.*(..))")
    public void logBefore(ProceedingJoinPoint proceedingJoinPoint) {

        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(args);
    }

    @After("execution(* com.example.exercice1.service.BookService.*(..))")
    public void logAfter(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Méthode terminée");
        Object[] args = proceedingJoinPoint.getArgs();
        System.out.println(args);


    }


}
