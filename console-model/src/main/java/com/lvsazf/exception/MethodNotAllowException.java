package com.lvsazf.exception;

import com.lvsazf.enums.ResultCode;

/**
 * @author 路智顺
 * @Description
 * @date 11:14 2019-01-04
 */
public class MethodNotAllowException extends BusinessException {
    private static final long serialVersionUID = -2775625000427470967L;
    public MethodNotAllowException() {
        super();
    }

    public MethodNotAllowException(Object data) {
        super.data = data;
    }

    public MethodNotAllowException(ResultCode resultCode) {
        super(resultCode);
    }

    public MethodNotAllowException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public MethodNotAllowException(String msg) {
        super(msg);
    }

    public MethodNotAllowException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }

}
