package com.lvsazf.exception;

import com.lvsazf.enums.ResultCode;

/**
 * @author 路智顺
 * @Description
 * @date 11:17 2019-01-04
 */
public class RemoteAccessException extends BusinessException {
    private static final long serialVersionUID = 1902045502491488959L;
    public RemoteAccessException() {
        super();
    }

    public RemoteAccessException(Object data) {
        super.data = data;
    }

    public RemoteAccessException(ResultCode resultCode) {
        super(resultCode);
    }

    public RemoteAccessException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public RemoteAccessException(String msg) {
        super(msg);
    }

    public RemoteAccessException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
