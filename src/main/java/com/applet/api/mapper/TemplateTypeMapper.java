package com.applet.api.mapper;

import com.applet.api.entity.TemplateType;
import com.applet.api.entity.TemplateTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateTypeMapper {
    int countByExample(TemplateTypeExample example);

    int deleteByExample(TemplateTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TemplateType record);

    int insertSelective(TemplateType record);

    List<TemplateType> selectByExample(TemplateTypeExample example);

    TemplateType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TemplateType record, @Param("example") TemplateTypeExample example);

    int updateByExample(@Param("record") TemplateType record, @Param("example") TemplateTypeExample example);

    int updateByPrimaryKeySelective(TemplateType record);

    int updateByPrimaryKey(TemplateType record);
}