package com.example.Sinara.Aspects;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class ApiLimitAspect {

    @Autowired
    private ApiConfig apiConfig;

    @Autowired
    private RequestCounter requestCounter;

    @Pointcut("execution(* com.example.Sinara.Aspects.ApiController.*(..)))")
    public void apiMethods() {}

    @Around("apiMethods()")
    public Object checkLimit(ProceedingJoinPoint joinPoint) throws Throwable {

        String methodName = joinPoint.getSignature().toShortString();

        // Проверяем текущее количество вызовов для данного метода
        int currentCount = requestCounter.getCount(methodName);

        requestCounter.increment(methodName);

        // Сравниваем с заданным лимитом в конфигурации
        if (currentCount >= apiConfig.getMaxRequests()) {
            log.info ("Limit exceeded for method: ", methodName);
            return null;
        }



        return joinPoint.proceed();
    }
}
