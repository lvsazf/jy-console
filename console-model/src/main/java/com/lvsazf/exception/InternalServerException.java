package com.lvsazf.exception;

/**
 * @author 路智顺
 * @Description
 * @date 11:17 2019-01-04
 */
public class InternalServerException extends BusinessException {

    private static final long serialVersionUID = 2980531091979689604L;
    public InternalServerException() {
        super();
    }

    public InternalServerException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public InternalServerException(String msg, Throwable cause, Object... objects) {
        super(msg, cause, objects);
    }

    public InternalServerException(String msg) {
        super(msg);
    }

    public InternalServerException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
