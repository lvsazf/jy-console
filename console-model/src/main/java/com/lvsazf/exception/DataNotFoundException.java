package com.lvsazf.exception;

import com.lvsazf.enums.ResultCode;

/**
 * @author 路智顺
 * @Description
 * @date 11:13 2019-01-04
 */
public class DataNotFoundException extends BusinessException {
    private static final long serialVersionUID = 3629845325322533663L;
    public DataNotFoundException() {
        super();
    }

    public DataNotFoundException(Object data) {
        super();
        super.data = data;
    }

    public DataNotFoundException(ResultCode resultCode) {
        super(resultCode);
    }

    public DataNotFoundException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public DataNotFoundException(String msg) {
        super(msg);
    }

    public DataNotFoundException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
