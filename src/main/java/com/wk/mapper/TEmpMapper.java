package com.wk.mapper;

import com.wk.pojo.TEmp;
import com.wk.pojo.TEmpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TEmpMapper {
    int countByExample(TEmpExample example);

    int deleteByExample(TEmpExample example);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    List<TEmp> selectByExample(TEmpExample example);

    int updateByExampleSelective(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByExample(@Param("record") TEmp record, @Param("example") TEmpExample example);
}