package org.lvsazf.algorithm;

import org.springframework.util.StringUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {


    public void quickSort(Integer[] origin) {
        quickSort(origin,0,origin.length-1);
    }

    public void quickSort(Integer[] origin,int left, int right) {
        Integer base = origin[0];
        int length = origin.length;
        if(left > right){
            return;
        }
        while (left < right) {
            while (left < right && base < origin[right]){
                right--;
            }
            origin[left] = origin[right];
            while (left < right && base > origin[left]) {
                left++;
            }
            origin[right] = origin[left];
        }
        origin[left] = base;
        quickSort(origin,0,left - 1);
        quickSort(origin,right + 1,length-1);
    }



    public void buddingSort(Integer[] origin) {
        int length = origin.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if(origin[j] > origin[j+1]){
                    Integer tmp = origin[j];
                    origin[j] = origin[j+1];
                    origin[j+1] = tmp;
                }
            }
        }
    }

    /**
     * reverse the given string,eg:abc return cba
     * @param originStr
     * @return
     */
    public String reverse(String originStr) {
        Stack<String> stack = new Stack();
        int length = originStr.length();
        for (int i = length - 1; i > -1; i--) {
            stack.push(String.valueOf(originStr.charAt(i)));
        }
        return stack.toString();
    }

    /**
     * validate the string has match '()', if matched return true,otherwise false;
     * @param s the validate string
     * @return
     */
    public boolean isMatch(String s) {
        if (!StringUtils.hasLength(s)) {
            return false;
        }
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracket = new HashMap<>();
        bracket.put(')', '(');
        Character c;
        for (int i = 0; i < length; i++) {
            c = s.charAt(i);
            if (bracket.containsValue(c)) {
                stack.push(c);
                continue;
            }
            if (bracket.containsKey(c)){
                if(stack.isEmpty()) {
                    return false; // fail false; if is empty,it means ) is first appear
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    /**
     * aba list a
     * @param text
     * @return
     */
    public boolean isPalindrome(String text){
        if(!StringUtils.hasLength(text)) {
            return false;
        }
        int len = text.length();
        int middle = len/2;
        Deque<Character> list = new LinkedList();
        for (int i = 0; i < len; i++) {
            Character c = text.charAt(i);
            if(i < middle) {
                list.add(c);
                continue;
            }
            if (list.isEmpty()) {
                return false;
            }
            if(c.equals(list.getLast())) {
                list.removeLast();
            }
        }
        return list.isEmpty();
    }

}
