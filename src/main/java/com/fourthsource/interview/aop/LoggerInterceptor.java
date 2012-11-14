package com.fourthsource.interview.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class LoggerInterceptor {

    @Around("execution(* com.fourthsource.interview..*.*(..))")
    public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
        Class<?> targetClass = joinPoint.getTarget().getClass();
        Logger logger = LoggerFactory.getLogger(targetClass);
        
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.debug("Calling method {} with arguments {}", methodName, args);
        
        StopWatch watch = new StopWatch();
        watch.start();
        
        Object returnValue = joinPoint.proceed();
        watch.stop();
        
        long totalTime = watch.getTotalTimeMillis();
        logger.debug("Returning {} from method {} in {} ms", returnValue, methodName, totalTime);
        
        return returnValue;
    }
    
}
