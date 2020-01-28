package com.buckvid.mapper;

import com.buckvid.pojo.BuckvidUsers;
import com.buckvid.pojo.BuckvidUsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuckvidUsersMapper {
    int countByExample(BuckvidUsersExample example);

    int deleteByExample(BuckvidUsersExample example);

    int deleteByPrimaryKey(String id);

    int insert(BuckvidUsers record);

    int insertSelective(BuckvidUsers record);

    List<BuckvidUsers> selectByExample(BuckvidUsersExample example);

    BuckvidUsers selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BuckvidUsers record, @Param("example") BuckvidUsersExample example);

    int updateByExample(@Param("record") BuckvidUsers record, @Param("example") BuckvidUsersExample example);

    int updateByPrimaryKeySelective(BuckvidUsers record);

    int updateByPrimaryKey(BuckvidUsers record);
}