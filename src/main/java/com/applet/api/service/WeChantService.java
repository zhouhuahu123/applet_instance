package com.applet.api.service;

import com.applet.api.entity.*;
import com.applet.api.mapper.WeChantInfoMapper;
import com.applet.api.util.NullUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
@Service
public class WeChantService {
    @Autowired
    private WeChantInfoMapper weChantInfoMapper;

    /**
     * 查询登录微信信息
     * @param openId
     * @return
     */
    public WeChantInfo selectWeChantInfo(String openId){
        WeChantInfoExample example = new WeChantInfoExample();
        example.createCriteria().andOpenIdEqualTo(openId);
        List<WeChantInfo> list = weChantInfoMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            WeChantInfo info = list.get(0);
            if (info.getStatus()){
                return info;
            }
            return null;
        } else {
            WeChantInfo info = new WeChantInfo();
            info.setOpenId(openId);
            info.setCreateTime(new Date());
            info.setStatus(true);
            weChantInfoMapper.insertSelective(info);
            return info;
        }
    }

}
