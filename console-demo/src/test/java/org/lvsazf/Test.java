package org.lvsazf;

import java.util.stream.Stream;

/**
 * @author 路智顺
 * @Description
 * @date 15:09 2019-01-16
 */
public class Test {

    @org.junit.Test
    public void test1(){
        Stream.of(String.class.getDeclaredFields()).forEach(field ->{
            System.out.println(field + "---" + field.getType().getSimpleName());
        });
    }

}
