package com.applet.api.mapper;

import com.applet.api.entity.ElementDetails;
import com.applet.api.entity.ElementDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementDetailsMapper {
    int countByExample(ElementDetailsExample example);

    int deleteByExample(ElementDetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElementDetails record);

    int insertSelective(ElementDetails record);

    List<ElementDetails> selectByExample(ElementDetailsExample example);

    ElementDetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElementDetails record, @Param("example") ElementDetailsExample example);

    int updateByExample(@Param("record") ElementDetails record, @Param("example") ElementDetailsExample example);

    int updateByPrimaryKeySelective(ElementDetails record);

    int updateByPrimaryKey(ElementDetails record);
}