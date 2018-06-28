package com.applet.api.entity;

import java.io.Serializable;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
public class TokenApplet implements Serializable {

    private Integer userId;
    private String appletCode, tokenLogin, openId, sessionKey, userName, mobile;
    private static final long serialVersionUID = 1L;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAppletCode() {
        return appletCode;
    }

    public void setAppletCode(String appletCode) {
        this.appletCode = appletCode;
    }

    public String getTokenLogin() {
        return tokenLogin;
    }

    public void setTokenLogin(String tokenLogin) {
        this.tokenLogin = tokenLogin;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public TokenApplet toWechatApplet() {
        //敏感数据 openId,sessionKey,code 不要传输到小程序
        TokenApplet tm = new TokenApplet();
        tm.setUserName(this.getUserName());
        tm.setMobile(this.getMobile());
        tm.setUserId(this.getUserId());
        tm.setTokenLogin(this.getTokenLogin());
        return tm;
    }

}
