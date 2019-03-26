package org.lvsazf.main;

import org.lvsazf.interfaces.UserCase;
import org.lvsazf.utils.PasswordUtils;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 路智顺
 * @Description
 * @date 15:54 2019-01-15
 */
public class UserCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
        for (Method m : cl.getDeclaredMethods()) {
            UserCase uc = m.getAnnotation(UserCase.class);
            if (uc != null) {
                System.out.println("Found Use Case: " + uc.id() + " " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Stream.of(47, 48, 49, 50).collect(Collectors.toList());
        trackUseCases(list, PasswordUtils.class);

    }
}
