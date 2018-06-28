package com.applet.api.mapper;

import com.applet.api.entity.ElementType;
import com.applet.api.entity.ElementTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementTypeMapper {
    int countByExample(ElementTypeExample example);

    int deleteByExample(ElementTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ElementType record);

    int insertSelective(ElementType record);

    List<ElementType> selectByExample(ElementTypeExample example);

    ElementType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ElementType record, @Param("example") ElementTypeExample example);

    int updateByExample(@Param("record") ElementType record, @Param("example") ElementTypeExample example);

    int updateByPrimaryKeySelective(ElementType record);

    int updateByPrimaryKey(ElementType record);
}