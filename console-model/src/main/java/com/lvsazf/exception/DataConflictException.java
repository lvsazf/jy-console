package com.lvsazf.exception;

import com.lvsazf.enums.ResultCode;

/**
 * @author 路智顺
 * @Description 数据异常
 * @date 11:15 2019-01-04
 */
public class DataConflictException extends BusinessException {
    private static final long serialVersionUID = 2056218721803116740L;
    public DataConflictException() {
        super();
    }

    public DataConflictException(Object data) {
        super.data = data;
    }

    public DataConflictException(ResultCode resultCode) {
        super(resultCode);
    }

    public DataConflictException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public DataConflictException(String msg) {
        super(msg);
    }

    public DataConflictException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
