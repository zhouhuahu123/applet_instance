package com.applet.api.core.constants;

/**
 * Created by lpfei on 2017/5/18.
 */
public class ResConstants {

    /**
     * 7牛公开web路径
     */
    public static final String WEB_URL = "http://pubcdn.mdanbao.com/";
    /**
     * 默认值
     */
    public static final String RES_CODE_00000 = "00000";
    //----------------10000 接口错误---------------------
    /**
     * 签名有误
     */
    public static final String RES_CODE_10001 = "10001";
    /**
     * 链接失效
     */
    public static final String RES_CODE_10002 = "10002";

    /**
     * 请求无效
     */
    public static final String RES_CODE_10003 = "10003";

    //----------------20000 校验错误-----------------------
    /**
     * 信息有误
     */
    public static final String RES_CODE_20001 = "20001";
    /**
     * 格式不正确
     */
    public static final String RES_CODE_20002 = "20002";
    /**
     * token无效
     */
    public static final String RES_CODE_20003 = "20003";
    //----------------30000 异常---------------------------
    /**
     * 异常
     */
    public static final String RES_CODE_30001 = "30001";
    /**
     * 网官错误
     */
    public static final String RES_CODE_30002 = "30002";

    //------------------40000  业务错误------------------------------
    //
    /**
     * 处理失败
     */
    public static final String RES_CODE_40001 = "40001";
    /**
     * 信息不存在
     */
    public static final String RES_CODE_40002 = "40002";

    /**
     * 不存在/已禁用
     */
    public static final String RES_CODE_41002 = "41002";

    /**
     * 信息不匹配
     */
    public static final String RES_CODE_41003 = "41003";

    /**
     * 列表 暂无数据
     */
    public static final String RES_CODE_42001 = "42001";
    /**
     * 列表 没有数据了
     */
    public static final String RES_CODE_42002 = "42002";

    /**
     * 发送频繁
     */
    public static final String RES_CODE_43001 = "43001";
    /**
     * 数据无效(不存在/超时/不匹配)
     */
    public static final String RES_CODE_43002 = "43002";
    /**
     * 超时
     */
    public static final String RES_CODE_43004 = "43004";

    //----------------------50000  权限类---------------------------------
    /**
     * 暂无权限
     */
    public static final String RES_CODE_50001 = "50001";
}
