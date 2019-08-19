package com.sdsoon.modular.system.mapper;

import com.sdsoon.modular.system.po.SsUserInfo;
import com.sdsoon.modular.system.po.SsUserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SsUserInfoMapper {
    long countByExample(SsUserInfoExample example);

    int deleteByExample(SsUserInfoExample example);

    int deleteByPrimaryKey(String userId);

    int insert(SsUserInfo record);

    int insertSelective(SsUserInfo record);

    List<SsUserInfo> selectByExample(SsUserInfoExample example);

    SsUserInfo selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") SsUserInfo record, @Param("example") SsUserInfoExample example);

    int updateByExample(@Param("record") SsUserInfo record, @Param("example") SsUserInfoExample example);

    int updateByPrimaryKeySelective(SsUserInfo record);

    int updateByPrimaryKey(SsUserInfo record);


}