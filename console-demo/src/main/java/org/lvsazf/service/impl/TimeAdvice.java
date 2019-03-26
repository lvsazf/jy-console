package org.lvsazf.service.impl;

import org.lvsazf.service.Advice;

/**
 * @author 路智顺
 * @Description
 * @date 14:59 2019-01-15
 */
public class TimeAdvice implements Advice {
    private long startTime;
    private long endTime;

    @Override
    public void before() {
        startTime = System.nanoTime();
    }

    @Override
    public void after() {
        endTime = System.nanoTime();
    }
}
