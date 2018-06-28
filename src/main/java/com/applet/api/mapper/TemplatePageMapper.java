package com.applet.api.mapper;

import com.applet.api.entity.TemplatePage;
import com.applet.api.entity.TemplatePageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplatePageMapper {
    int countByExample(TemplatePageExample example);

    int deleteByExample(TemplatePageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TemplatePage record);

    int insertSelective(TemplatePage record);

    List<TemplatePage> selectByExample(TemplatePageExample example);

    TemplatePage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TemplatePage record, @Param("example") TemplatePageExample example);

    int updateByExample(@Param("record") TemplatePage record, @Param("example") TemplatePageExample example);

    int updateByPrimaryKeySelective(TemplatePage record);

    int updateByPrimaryKey(TemplatePage record);
}