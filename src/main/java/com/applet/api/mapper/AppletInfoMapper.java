package com.applet.api.mapper;

import com.applet.api.entity.AppletInfo;
import com.applet.api.entity.AppletInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AppletInfoMapper {
    int countByExample(AppletInfoExample example);

    int deleteByExample(AppletInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AppletInfo record);

    int insertSelective(AppletInfo record);

    List<AppletInfo> selectByExample(AppletInfoExample example);

    AppletInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AppletInfo record, @Param("example") AppletInfoExample example);

    int updateByExample(@Param("record") AppletInfo record, @Param("example") AppletInfoExample example);

    int updateByPrimaryKeySelective(AppletInfo record);

    int updateByPrimaryKey(AppletInfo record);
}