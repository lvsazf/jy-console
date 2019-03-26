package org.lvsazf.main;

import org.lvsazf.proxy.SalaryProxy;
import org.lvsazf.service.SalaryService;
import org.lvsazf.service.impl.SalaryServiceImpl;
import org.lvsazf.service.impl.TimeAdvice;

/**
 * @author 路智顺
 * @Description
 * @date 15:14 2019-01-15
 */
public class ProxyMain {

    public static void main(String[] args) {
        SalaryProxy proxy = new SalaryProxy();
        SalaryService service = (SalaryService) proxy.bind(new SalaryServiceImpl(), new TimeAdvice());
        service.doSalary();
    }
}
