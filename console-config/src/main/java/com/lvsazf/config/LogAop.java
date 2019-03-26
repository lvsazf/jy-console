package com.lvsazf.config;

import com.lvsazf.core.annotation.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 路智顺
 * @Description
 * @date 17:33 2019-02-11
 */
@Aspect
@Configuration
public class LogAop {
    private final static Logger logger = LoggerFactory.getLogger(LogAop.class);

    @Around(value = "@annotation(logPrint)")
    public Object twiceAsOld1(ProceedingJoinPoint joinPoint, Log logPrint) {
        Signature signature = joinPoint.getSignature();
        List<Object> args = Stream.of(joinPoint.getArgs()).filter(param -> Objects.nonNull(param)).collect(Collectors.toList());
        String methodName = signature.getName();
        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            logger.error("err:{}", throwable);
        }
        boolean b = logPrint.needPrintResponse();
        if(!b){
            logger.info("方法：{},信息：{},入参：{}", methodName, logPrint.message(), args);
        }else {
            logger.info("方法：{},信息：{},入参：{},出参：{}", methodName, logPrint.message(), args, proceed);
        }
        return proceed;
    }

}
