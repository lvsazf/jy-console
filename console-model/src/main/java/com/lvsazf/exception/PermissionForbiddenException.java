package com.lvsazf.exception;

import com.lvsazf.enums.ResultCode;

/**
 * @author 路智顺
 * @Description 权限不足异常
 * @date 11:09 2019-01-04
 */
public class PermissionForbiddenException extends BusinessException {

    private static final long serialVersionUID = -3675999604677486069L;

    public PermissionForbiddenException() {
        super();
    }

    public PermissionForbiddenException(Object data) {
        super.data = data;
    }

    public PermissionForbiddenException(ResultCode resultCode) {
        super(resultCode);
    }

    public PermissionForbiddenException(ResultCode resultCode, Object data) {
        super(resultCode, data);
    }

    public PermissionForbiddenException(String msg) {
        super(msg);
    }

    public PermissionForbiddenException(String formatMsg, Object... objects) {
        super(formatMsg, objects);
    }
}
