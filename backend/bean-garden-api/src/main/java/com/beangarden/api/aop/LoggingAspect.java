package com.beangarden.api.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.beangarden.api.controller..*(..)) || " +
            "execution(* com.beangarden.api.service..*(..))")
    public Object logExecution(ProceedingJoinPoint joinPoint) throws Throwable {

        String method = joinPoint.getSignature().toShortString();
        System.out.println("[START] " + method);

        Object result = joinPoint.proceed();

        System.out.println("[END] " + method);
        return result;
    }
}
