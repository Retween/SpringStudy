package com.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspect {
    @Around("execution(* com.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoriesAdvice(
            ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        ProceedingJoinPoint pjp;
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String methodName = methodSignature.getName();

        System.out.println("Start of " + methodName);

        Object target = proceedingJoinPoint.proceed();

        System.out.println("End of " + methodName);

        return target;
    }
}
