package com.applet.api.core.constants;

/**
 * 系统常量
 *
 * @author fanlei
 */
public class PUBConstants {


    /**
     * Session属性
     */
    public static final String SESSION_CAPTCHA = "_sc";
    public static final String SESSION_CAPTCHA_MIX = "_scm";
    public static final String SESSION_CUR_USER = "_scu";
    public static final String SESSION_CUR_USER_OBJ = "_scu_obj";
    public static final String SESSION_SMS_MOBILE = "_ssm";
    public static final String SESSION_SMS_CAPTCHA = "_ssc";
    public static final String SESSION_ADMIN_USER = "_sau";
    public static final String SESSION_ADMIN_USER_OBJ = "_sau_obj";
    public static final String SESSION_ADMIN_RES = "_sas";
    public static final String SESSION_ADMIN_RES_REGEX = "_sasr";
    public static final String SESSION_ADMIN_RES_LINKS = "_sasl";
    public static final String SESSION_ADMIN_RES_BTNS = "_sasbtn";
    public static final String SESSION_MER_ADMIN_RES_BTNS = "_mer_sasbtn";
    public static final String SESSION_RECHARGE_ORDERID = "_rec_oid";
    public static final String SESSION_ADMIN_MENU = "_sys_menu";
    public static final String SESSION_ADMIN_MENU_SORT = "_sys_menu_sort";
    public static final String SESSION_ADMIN_MENU_SORT_SET = "_sys_menu_sort_set";
    public static final String SESSION_ADMIN_ROLE = "_sar";

    public static final String TOKEN_MERCHANT = "TOKEN_MERCHANT";

    public static final int ROLE_CUSTOMER__ID = 4;            //客服角色 常量值
    /**
     * Default ase key
     */
    public static final String DEFAULT_AES_KEY = "mo0NjhD4IVqx0Q==";
    /**
     * Default charset
     */
    public static final String DEFAULT_CHARSET = "UTF-8";
    /**
     * Remember me cookie
     */
    public static final String REMEMBER_ME_SIGN = "_sign";
    /**
     * Cookie有效期(分钟)
     */
    public static final int COOKIE_VALID = 60;
    /**
     * 防重复提交TOKEN
     */
    public static final String TOKEN = "_token";
    /**
     * AJAX返回代码
     */
    public static final String ERROR_CODE = "-1";
    public static final String SUCCESS_CODE = "1";
    public static final String EXPIRED_CODE = "-2";
    /**
     * 默认分页大小
     */
    public static final int DEFAULT_PAGESIZE = 10;
    /**
     * Jdk默认时间格式
     */
    public static final String DEFAULT_DATE_FORMAT_JDK = "yyyy-MM-dd HH:mm:ss";

    public static final String DATE_FORMAT_FRONT = "yyyy-MM-dd";
    /**
     * Jodd默认时间格式
     */
    public static final String DEFAULT_DATE_FORMAT_JODD = "yyyy-MM-dd HH:mm:ss";
    public static final String DEFAULT_DATE_FORMAT_STAMP = "yyyyMMddHHmmss";
    public static final String JODD_TIME_FMT_YMDHMS = "YYYYMMDDhhmmss";
    public static final String DEFAULT_DATE_FORMAT_FRONT_STAMP = "yyyy-MM-dd";
    /**
     * 操作标识
     */
    public static final String ACTION_FLAG = "actionFlag";
    /**
     * 数据分隔符
     */
    public static final String DATA_SEP = "~~";
    /**
     * 验证手机号码正则
     */
    public static final String MOBILE_REGEX = "^(1[34578])\\d{9}$";
    /**
     * 启用、禁用状态
     */
    public static final Integer ENABLE_STATUS = 1;
    public static final Integer DISABLE_STATUS = 0;
    /**
     * 是否
     */
    public static final String YES = "1";
    public static final String NO = "0";

    /**
     * 商银信外部支付接入
     */
    public static final String ALLSCORE_SERVICE_DIRECT = "serviceDirect.htm";
    /**
     * 商银信通知验证
     */
    public static final String ALLSCORE_NOTICE_QUERY = "noticeQuery.htm";
    /**
     * 商银信订单查询
     */
    public static final String ALLSCORE_ORDER_QUERY = "orderQuery.htm";
    /**
     * 消息队列
     */
    public static final String QUEUE_NAME_EMAIL = "emailQueue";
    public static final String QUEUE_NAME_STATION = "stationQueue";
    public static final String QUEUE_NAME_SMS = "smsQueue";
    public static final String QUEUE_NAME_WECHAT = "wechatQueue";
    /**
     * 系统管理员username
     */
    final public static String SYS_ADMIN_NAME = "admin";

    /**
     *
     */
    public static final Integer SYS_USER_STATUS_NORMAL = 0;    //正常
    public static final Integer SYS_USER_STATUS_LOCK = 1;    //正常

    public static final Integer LOCK = 1;
    public static final Integer UN_LOCK = 0;

    public static final int ROLE_YWY = 20;
    public static final int ROLE_YWZG = 21;

    public static final int CODE_LENGTH = 6;//助手登录验证码长度


    public static final String ASSIATANT_LOGIN = "LOGIN";//登录验证码短信模板类型
    public static final String AUTHINFO_TYPE_WECHAT_APPLET = "WM"; //Wechat Merchant;
    public static final String AUTHINFO_TYPE_ASSISTANT = "ASSISTANT"; //语音助手
    /**
     * dt_shop_visit remark
     */
    public static final String VISIT_BEFORE_AUDIT = "审核前回访";
    public static final String VISIT_FEED_BACK = "反馈完成24小时内回访";
    public static final String VISIT_AFTER_3D = "反馈完成后首次回访";
    public static final String VISIT_AFTER_7D = "反馈完成后二次回访";
    public static final String VISIT_AFTER_10D = "反馈完成后三次回访";
    public static final String VISTT_OTHER = "其他回访";


    /**
     * 渠道
     */
    public static final int USER_TYPE_2 = 2;
    /**
     * 搜索时间格式
     */
    public static final String DATE_FORMAT_FRONT_STA = "YYYY-MM-DD 00:00:00";
    public static final String DATE_FORMAT_FRONT_END = "YYYY-MM-DD 23:59:59";
}
