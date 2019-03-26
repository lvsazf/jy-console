package com.lvsazf.enums;

/**
 * @author 路智顺
 * @Description
 * @date 22:30 2019-01-10
 */
public enum CallSourceEnum {
    /**
     * WEB网站
     */
    WEB,
    /**
     * PC客户端
     */
    PC,
    /**
     * 微信公众号
     */
    WECHAT,
    /**
     * IOS平台
     **/
    IOS,
    /**
     * 安卓平台
     */
    ANDROID;

    public static boolean isValid(String name) {
        for (CallSourceEnum callSource : CallSourceEnum.values()) {
            if (callSource.name().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
