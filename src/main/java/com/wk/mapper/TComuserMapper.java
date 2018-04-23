package com.wk.mapper;

import com.wk.pojo.TComuser;
import com.wk.pojo.TComuserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TComuserMapper {
    int countByExample(TComuserExample example);

    int deleteByExample(TComuserExample example);

    int insert(TComuser record);

    int insertSelective(TComuser record);

    List<TComuser> selectByExample(TComuserExample example);

    int updateByExampleSelective(@Param("record") TComuser record, @Param("example") TComuserExample example);

    int updateByExample(@Param("record") TComuser record, @Param("example") TComuserExample example);
}