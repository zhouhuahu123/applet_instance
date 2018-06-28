package com.applet.api.service;

import com.applet.api.entity.AppletInfo;
import com.applet.api.entity.AppletInfoExample;
import com.applet.api.mapper.AppletInfoMapper;
import com.applet.api.util.NullUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouhuahu on 2018/6/27.
 */
@Service
public class AppletService {
    @Autowired
    private AppletInfoMapper appletInfoMapper;

    /**
     * 查询登录小程序信息
     * @param appletCode
     * @return
     */
    public AppletInfo selectAppletInfo(String appletCode) throws Exception{
        AppletInfoExample example = new AppletInfoExample();
        example.createCriteria().andAppletCodeEqualTo(appletCode).andStatusEqualTo(true);
        List<AppletInfo> list = appletInfoMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            return list.get(0);
        }
        throw new Exception("获取小程序信息失败");
    }
}
