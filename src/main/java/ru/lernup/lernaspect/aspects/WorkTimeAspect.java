package ru.lernup.lernaspect.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Instant;
@Aspect
@Component
@Slf4j
public class WorkTimeAspect {
@Around("@annotation(ru.lernup.lernaspect.annotation.WorkTime)")
    public Object logMethod(ProceedingJoinPoint point) throws Throwable {
        long start = Instant.now().toEpochMilli();
        String nameMethod = point.getSignature().getName();
        Object proceed = point.proceed();
        long and = Instant.now().toEpochMilli();
        long time= and- start;
        log.info("{} method invoked by {}.ms",nameMethod,time);
        return  proceed;
    }
}
