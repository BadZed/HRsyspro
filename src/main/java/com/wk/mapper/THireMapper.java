package com.wk.mapper;

import com.wk.pojo.THire;
import com.wk.pojo.THireExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface THireMapper {
    int countByExample(THireExample example);

    int deleteByExample(THireExample example);

    int insert(THire record);

    int insertSelective(THire record);

    List<THire> selectByExample(THireExample example);

    int updateByExampleSelective(@Param("record") THire record, @Param("example") THireExample example);

    int updateByExample(@Param("record") THire record, @Param("example") THireExample example);
}