package ru.lernup.lernaspect.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Component
@Slf4j
public class LogMethodAspect {

    @Around("@annotation(ru.lernup.lernaspect.annotation.LogMethod)")
    public Object logMethod(ProceedingJoinPoint point) throws Throwable {
        String nameMethod = point.getSignature().getName();
        Object proceed = point.proceed();
      log.info("Name method {} with params = {} result ={}",nameMethod,point.getArgs(),proceed);
        return  proceed;
    }
}
