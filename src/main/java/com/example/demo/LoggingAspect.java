package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
class LoggingAspect {
    private static final Logger LOG = LoggerFactory.getLogger(LoggingAspect.class);

    @Around("within(com.example.demo.PointcutedHelloController)")
    Object aroud(ProceedingJoinPoint pjp) throws Throwable {
        LOG.info(pjp.getSignature().toLongString());
        return pjp.proceed();
    }
}
