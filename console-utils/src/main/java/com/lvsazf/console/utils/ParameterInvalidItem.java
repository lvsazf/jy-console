package com.lvsazf.console.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 路智顺
 * @Description
 * @date 16:24 2019-01-05
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParameterInvalidItem {
    /**
     * 对象的名称
     */
    private String objectName;

    /**
     * 无效字段的名称
     */
    private String fieldName;

    /**
     * 错误信息
     */
    private String message;


}
