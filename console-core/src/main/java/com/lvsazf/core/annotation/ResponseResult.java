package com.lvsazf.core.annotation;

import com.lvsazf.model.result.PlatformResult;
import com.lvsazf.model.result.Result;

import java.lang.annotation.*;

/**
 * @author 路智顺
 * @Description controller返回结果增强，ResponseResultHandler处理
 * @date 17:37 2019-01-03
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseResult {
    Class<? extends Result> value() default PlatformResult.class;
}
