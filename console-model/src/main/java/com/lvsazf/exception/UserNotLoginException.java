package com.lvsazf.exception;

/**
 * @author 路智顺
 * @Description
 * @date 11:16 2019-01-04
 */
public class UserNotLoginException extends BusinessException {

    private static final long serialVersionUID = 1004543591297768987L;
    public UserNotLoginException() {
        super();
    }

    public UserNotLoginException(String msg) {
        super(msg);
    }

    public UserNotLoginException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
