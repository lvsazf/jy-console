package org.lvsazf.proxy;

import org.lvsazf.service.Advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 路智顺
 * @Description
 * @date 14:14 2019-01-15
 */
public class SalaryProxy implements InvocationHandler {
    private Object obj;
    private Advice advice;

    public Object bind(Object obj, Advice advice){
        this.obj = obj;
        this.advice = advice;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        try {
            advice.before();
            result = method.invoke(obj,args);
            advice.after();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }
}
