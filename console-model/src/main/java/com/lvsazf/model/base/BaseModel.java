package com.lvsazf.model.base;

/**
 * @author 路智顺
 * @Description
 * @date 14:44 2019-01-17
 */
public class BaseModel {
    /**
     * 每页条数
     */
    private Integer pageSize;
    /**
     * 页数
     */
    private Integer pageNum;

    public Integer getPageSize() {
        return pageSize == null ? 20 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum == null ? 0 : pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
