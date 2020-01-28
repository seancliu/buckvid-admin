package com.buckvid.mapper;

import com.buckvid.pojo.Reports;
import com.buckvid.pojo.ReportsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ReportsMapper {
    int countByExample(ReportsExample example);

    int deleteByExample(ReportsExample example);

    int deleteByPrimaryKey(String id);

    int insert(Reports record);

    int insertSelective(Reports record);

    List<Reports> selectByExample(ReportsExample example);

    Reports selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Reports record, @Param("example") ReportsExample example);

    int updateByExample(@Param("record") Reports record, @Param("example") ReportsExample example);

    int updateByPrimaryKeySelective(Reports record);

    int updateByPrimaryKey(Reports record);
}