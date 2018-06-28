package com.applet.api.util;

import com.applet.api.core.security.SHA;
import com.applet.api.util.RandomUtil;

/**
 * Created by chang on 2017/2/17.
 */
public class WechatAppletUtil {

    public static String create3RDSession(String openId, String sessionKey) {
        return SHA.SHA(openId + sessionKey + RandomUtil.getUUID());
    }

    public static String create3RDSession() {
        return SHA.SHA(RandomUtil.getUUID());
    }
}
