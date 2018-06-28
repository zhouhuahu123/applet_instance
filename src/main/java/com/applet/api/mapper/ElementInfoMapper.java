package com.applet.api.mapper;

import com.applet.api.entity.ElementInfo;
import com.applet.api.entity.ElementInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementInfoMapper {
    int countByExample(ElementInfoExample example);

    int deleteByExample(ElementInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElementInfo record);

    int insertSelective(ElementInfo record);

    List<ElementInfo> selectByExample(ElementInfoExample example);

    ElementInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElementInfo record, @Param("example") ElementInfoExample example);

    int updateByExample(@Param("record") ElementInfo record, @Param("example") ElementInfoExample example);

    int updateByPrimaryKeySelective(ElementInfo record);

    int updateByPrimaryKey(ElementInfo record);
}