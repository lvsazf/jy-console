package com.lvsazf.mapper;

import com.lvsazf.model.Code;

public interface CodeMapper {
    int deleteByPrimaryKey(String sid);

    int insert(Code record);

    int insertSelective(Code record);

    Code selectByPrimaryKey(String sid);

    int updateByPrimaryKeySelective(Code record);

    int updateByPrimaryKeyWithBLOBs(Code record);

    int updateByPrimaryKey(Code record);
}