package com.applet.api.mapper;

import com.applet.api.entity.TemplateImg;
import com.applet.api.entity.TemplateImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateImgMapper {
    int countByExample(TemplateImgExample example);

    int deleteByExample(TemplateImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TemplateImg record);

    int insertSelective(TemplateImg record);

    List<TemplateImg> selectByExample(TemplateImgExample example);

    TemplateImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TemplateImg record, @Param("example") TemplateImgExample example);

    int updateByExample(@Param("record") TemplateImg record, @Param("example") TemplateImgExample example);

    int updateByPrimaryKeySelective(TemplateImg record);

    int updateByPrimaryKey(TemplateImg record);
}