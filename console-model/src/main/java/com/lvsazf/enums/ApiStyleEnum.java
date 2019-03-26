package com.lvsazf.enums;

/**
 * @author 路智顺
 * @Description
 * @date 10:34 2019-01-09
 */
public enum ApiStyleEnum {
    NONE;

    public static boolean isValid(String name) {
        for (ApiStyleEnum callSource : ApiStyleEnum.values()) {
            if (callSource.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
