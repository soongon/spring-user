package com.example.springuser.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.springuser.controller.UserController.*(..))")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println("타겟 메소드 수행전 실행됩니다.");
    }

    @Around("execution(* com.example.springuser.service.UserService.*(..))")
    public Object loggingAroundAdvice(ProceedingJoinPoint pJoinPoint) throws Throwable {
        String clsName = pJoinPoint.getSignature().getDeclaringTypeName();
        String methodName = pJoinPoint.getSignature().getName();

        System.out.println(clsName + "." + methodName + " 메소드 수행 전 실행됩니다.");
        Object obj = pJoinPoint.proceed();
        System.out.println(clsName + "." + methodName + " 메소드 수행 후 실행됩니다.");
        return obj;
    }
}
