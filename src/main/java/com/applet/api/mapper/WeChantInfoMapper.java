package com.applet.api.mapper;

import com.applet.api.entity.WeChantInfo;
import com.applet.api.entity.WeChantInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeChantInfoMapper {
    int countByExample(WeChantInfoExample example);

    int deleteByExample(WeChantInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeChantInfo record);

    int insertSelective(WeChantInfo record);

    List<WeChantInfo> selectByExample(WeChantInfoExample example);

    WeChantInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeChantInfo record, @Param("example") WeChantInfoExample example);

    int updateByExample(@Param("record") WeChantInfo record, @Param("example") WeChantInfoExample example);

    int updateByPrimaryKeySelective(WeChantInfo record);

    int updateByPrimaryKey(WeChantInfo record);
}