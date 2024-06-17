package com.sparta.igeomubwotna.aop;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class ControllerAop {

    private final HttpServletRequest request;

    @Pointcut("execution(* com.sparta.igeomubwotna.controller.CommentController.*(..))")
    private void comment() {
    }

    @Pointcut("execution(* com.sparta.igeomubwotna.controller.LikeController.*(..))")
    private void like() {
    }

    @Pointcut("execution(* com.sparta.igeomubwotna.controller.RecipeController.*(..))")
    private void recipe() {
    }

    @Pointcut("execution(* com.sparta.igeomubwotna.controller.UserController.*(..))")
    private void user() {
    }

    @Around("comment() || like() || recipe() || user()")
    public Object ControllerAop(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object output = joinPoint.proceed();
            return output;
        } finally {
            log.info("URI : " + request.getRequestURI());
            log.info("METHOD : " + request.getMethod());
        }
    }

}