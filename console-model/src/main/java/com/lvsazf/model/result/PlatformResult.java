package com.lvsazf.model.result;

import com.lvsazf.enums.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

/**
 * @author 路智顺
 * @Description 平台通用返回结果
 * @date 17:49 2019-01-03
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlatformResult implements Result {

    private static final long serialVersionUID = -5828457777653557651L;
    private int code;

    private String msg;

    private Object data;

    public static PlatformResult success() {
        return success(null);
    }

    public static PlatformResult success(Object data) {
        PlatformResult result = new PlatformResult();
        result.setResultCode(ResultCode.SUCCESS);
        Optional.ofNullable(data).ifPresent(item -> result.setData(item));
        return result;
    }

    public static PlatformResult failure(ResultCode resultCode, Object data) {
        PlatformResult result = new PlatformResult();
        resultCode = Optional.ofNullable(resultCode).orElse(ResultCode.PARAM_IS_INVALID);
        result.setResultCode(resultCode);
        Optional.ofNullable(data).ifPresent(item -> result.setData(data));
        return result;
    }

    public static PlatformResult failure(ResultCode resultCode) {
        return failure(resultCode, null);
    }

    public static PlatformResult failure(Object data) {
        return failure(null, data);
    }

    private void setResultCode(ResultCode resultCode) {
        this.code = resultCode.code();
        this.msg = resultCode.message();
    }
}
