package com.applet.api.service.template;

import com.applet.api.entity.*;
import com.applet.api.mapper.*;
import com.applet.api.util.NullUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhouhuahu on 2018/6/27.
 */
@Service
public class TemplateService {
    private static final Logger logger = LoggerFactory.getLogger(TemplateService.class);
    @Autowired
    private TemplatePageMapper templatePageMapper;
    @Autowired
    private ElementInfoMapper elementInfoMapper;
    @Autowired
    private ElementDetailsMapper elementDetailsMapper;
    @Autowired
    private ElementTypeMapper elementTypeMapper;

    /**
     * 查询模板页面
     * @param templateId
     * @param pageLogo
     * @return
     */
    public TemplatePage selectTemplatePage(Integer templateId, String pageLogo){
        TemplatePageExample example = new TemplatePageExample();
        example.createCriteria().andTemplateIdEqualTo(templateId).andPageLogoEqualTo(pageLogo).andStatusEqualTo(true);
        List<TemplatePage> list = templatePageMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            return list.get(0);
        }
        return null;
    }

    /**
     * 查询页面元素类型
     * @param pageId
     * @return
     */
    public List<ElementType> selectElementTypeList(Integer pageId){
        ElementTypeExample example = new ElementTypeExample();
        example.createCriteria().andTemplatePageIdEqualTo(pageId).andStatusEqualTo(true);
        return elementTypeMapper.selectByExample(example);
    }

    /**
     * 查询页面元素集合
     * @param pageId
     * @param typeId
     * @return
     */
    public List<ElementInfo> selectElementList(Integer appletId, Integer pageId, Integer typeId){
        ElementInfoExample example = new ElementInfoExample();
        example.createCriteria().andAppletIdEqualTo(appletId).andTemplatePageIdEqualTo(pageId).andElementTypeIdEqualTo(typeId).andStatusEqualTo(true);
        return elementInfoMapper.selectByExample(example);
    }

    /**
     * 查询页面所有元素
     * @param appletId
     * @param templateId
     * @param pageLogo
     * @return
     * @throws Exception
     */
    public Map selectTemplateInfo(Integer appletId, Integer templateId, String pageLogo) throws Exception {
        TemplatePage page = selectTemplatePage(templateId, pageLogo);
        if(page == null){
            logger.info("未查询到相关页面，templateId:{};pageLogo:{}", templateId, pageLogo);
            throw new Exception("未查询到相关页面");
        }
        List<ElementType> typeList = selectElementTypeList(page.getId());
        if (!NullUtil.isNotNullOrEmpty(typeList)){
            logger.info("未查询到页面相关元素类型，pageId:{};", page.getId());
            throw new Exception("未查询到页面相关元素类型");
        }
        Map<String, Object> map = new HashMap<String, Object>();
        for(ElementType type:typeList){
            List<ElementInfo> list = selectElementList(appletId, page.getId(), type.getId());
            if (NullUtil.isNotNullOrEmpty(list)){
                map.put(type.getElementType(), list);
            }
        }
        return map;
    }

}
