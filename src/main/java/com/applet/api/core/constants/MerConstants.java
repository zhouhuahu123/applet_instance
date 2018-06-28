package com.applet.api.core.constants;

import java.util.*;

/**
 * Created by zhouhuahu on 2017/8/28.
 */
public class MerConstants {
    public static final String ADMIN_AUTH_THIRD_LIST = "mer_third_list";
    public static final String ADMIN_AUTH_THIRD_AUDIT = "mer_third_audit";
    public static final String ADMIN_AUTH_CENTER_LIST = "mer_center_list";
    public static final String ADMIN_AUTH_CENTER_AUDIT = "mer_center_audit";

    public static final int MER_PIC_SHOW = 0;
    public static final int MER_PIC_HIDE = -1;

    public static final String MER_AUDIT_OPT_LEADER = "LEADER";
    public static final String MER_AUDIT_OPT_CENTER = "CENTER";
    public static final String MER_AUDIT_OPT_THIRD = "THIRD";

    public static final String WX_AUTH_SALES = "SALES";

    //APP查询审核状态分类
    public static final String QUERY_AUDIT_TYPE_AWAIT = "await";//待审核
    public static final String QUERY_AUDIT_TYPE_ADOPT = "adopt";//已通过
    public static final String QUERY_AUDIT_TYPE_NOT_PASS = "notPass";//未通过

    //访问订单方式
    public static final String MER_ORDER_MY = "my";//我的订单
    public static final String MER_ORDER_AUDIT = "audit";//审核订单

    public static final String MER_STATUS_DRAFT_CANCEL = "draft_cancel";//草稿删除
    public static final String MER_STATUS_BUSINESS_CANCEL = "audit_cancel";//未通过删除

    //默认审核的备注
    public static final String DRAFT_RAMARK = "无";

    public static final String VISIT_BEFORE_AUDIT = "审核前回访";
    public static final String VISIT_FEED_BACK = "反馈完成24小时内回访";
    public static final String VISIT_AFTER_3D = "反馈完成后首次回访";
    public static final String VISIT_AFTER_7D = "反馈完成后二次回访";
    public static final String VISIT_AFTER_10D = "反馈完成后三次回访";
    public static final String VISTT_OTHER = "其他回访";


    /**
     * 报单进件状态
     */
    public static final String MER_DRAFT_STATUS = "draft";//草稿
    public static final String MER_AUDIT_STATUS_WAIT = "submit";//待审核
    public static final String MER_AUDIT_STATUS_LEADER_PASS = "leader_passed";//主管审核通过
    public static final String MER_AUDIT_STATUS_LEADER_NOT_PASS = "leader_not_pass";//主管审核驳回
    public static final String MER_AUDIT_STATUS_CENTER_PASS = "center_passed";//中心审核通过
    public static final String MER_AUDIT_STATUS_CENTER_NOT_PASS = "center_not_pass";//中心审核驳回
    public static final String MER_AUDIT_STATUS_THIRD_PASS = "third_passed";//第三方审核通过
    public static final String MER_AUDIT_STATUS_THIRD_NOT_PASS = "third_not_pass";//第三方审核驳回
    public static final Map<String, String> MER_AUDIT_STATUS_MAP = new HashMap<String, String>() {
        {
            put(MER_AUDIT_STATUS_WAIT, "待业务主管审核");
            put(MER_AUDIT_STATUS_LEADER_PASS, "待订单处理中心审核");
            put(MER_AUDIT_STATUS_CENTER_PASS, "待第三方审核");
            put(MER_AUDIT_STATUS_LEADER_NOT_PASS, "业务主管驳回");
            put(MER_AUDIT_STATUS_CENTER_NOT_PASS, "订单处理中心驳回");
            put(MER_AUDIT_STATUS_THIRD_NOT_PASS, "第三方驳回");
            put(MER_AUDIT_STATUS_THIRD_PASS, "第三方审核通过");
        }
    };

    public static final Map<String, String> MER_AUDIT_THIRD_STATUS_MAP = new HashMap<String, String>() {
        {
            put(MER_AUDIT_STATUS_CENTER_PASS, "待第三方审核");
            put(MER_AUDIT_STATUS_THIRD_NOT_PASS, "第三方驳回");
            put(MER_AUDIT_STATUS_THIRD_PASS, "第三方审核通过");
        }
    };

    public static final List<String> MER_AUDIT_THIRD_STATUS_LIST = new ArrayList<String>() {
        {
            add(MER_AUDIT_STATUS_CENTER_PASS);
            add(MER_AUDIT_STATUS_THIRD_NOT_PASS);
            add(MER_AUDIT_STATUS_THIRD_PASS);
        }
    };

    /**
     * 报单进件工商类型
     */
    public static final String MER_REG_TYPE_PERSON = "person";
    public static final String MER_REG_TYPE_COMPANY = "company";
    public static final Map<String, String> MER_REG_TYPE_MAP = new HashMap<String, String>() {
        {
            put(MER_REG_TYPE_PERSON, "个体工商户");
            put(MER_REG_TYPE_COMPANY, "企业");
        }
    };

    /**
     * 报单进件所属行业
     */
    public static final String BUSINESS_TYPE_CYMS = "CYMS";
    public static final String BUSINESS_TYPE_JDYL = "JDYL";
    public static final String BUSINESS_TYPE_SHFW = "SHFW";
    public static final String BUSINESS_TYPE_OTHER = "OTHER";
    public static final Map<String, String> MER_BUSINESS_TYPE_MAP = new HashMap<String, String>() {
        {
            put(BUSINESS_TYPE_CYMS, "餐饮美食");
            put(BUSINESS_TYPE_JDYL, "酒店娱乐");
            put(BUSINESS_TYPE_SHFW, "生活服务");
            put(BUSINESS_TYPE_OTHER, "其他");
        }
    };

    /**
     * 报单进件类型
     */
    public static final String MER_APPLY_TYPE_CODE = "CODE";
    public static final String MER_APPLY_TYPE_POS = "POS";
    public static final Map<String, String> MER_TYPE_MAP = new HashMap<String, String>() {
        {
            put(MER_APPLY_TYPE_CODE, "扫码商户");
            put(MER_APPLY_TYPE_POS, "POS商户");
        }
    };

    /**
     * app拉卡拉经营内容
     */
    public static final Map<String, String> APP_LKL_RUN_CONTENT_MAP = new LinkedHashMap<String, String>() {
        {
            put("1001", "餐饮、宾馆、娱乐、珠宝金饰、工艺美术品");
            put("1002", "房地产汽车类");
            put("1003", "百货、中介、培训、景区门票等");
            put("1004", "批发类商户");
            put("1005", "加油、超市类");
            put("1006", "交通运输售票");
            put("1007", "水电气缴费");
            put("1008", "政府类");
            put("1009", "便民类");
            put("1010", "公立医院、公立学校、慈善");
            put("1011", "宾馆餐饮娱乐类");
            put("1012", "房产汽车类");
            put("1013", "批发类");
            put("1014", "超市加油类一般类商户");
            put("1015", "一般类商户");
            put("1016", "三农商户");
        }
    };

    /**
     * 进件图片资料
     */
    public static final Map<Integer, String> MER_PIC_TYPE = new LinkedHashMap<Integer, String>() {
        {
            put(0, "营业执照照片（不允许复印件）");
            put(1, "法定代表人身份证正面（不允许复印件，必须为证件有效期内）");
            put(2, "法定代表人身份证反面（不允许复印件，必须为证件有效期内）");
            put(3, "店面经营照片（门头）");
            put(4, "店面经营照片（收银台）");
            put(5, "店面经营照片（体现主营的店内照片）");
            put(6, "通道协议照片(正)");
            put(7, "《买单宝平台服务合作协议》签署页照片");
            put(8, "业务代表与商家结算人手持《买单宝平台服务合作协议》及身份证合影");
            put(9, "法人银行卡正面照片（不允许复印件，必须为证件有效期内）");
            put(10, "法人银行卡反面照片（不允许复印件，必须为证件有效期内）");
            put(11, "委托清算授权书（法人、结算人手持委托书和身份证合照）");
            put(12, "委托授权书（买单宝协议中的委托书）");
            put(13, "委托人身份证正面（不允许复印件，必须为证件有效期内）");
            put(14, "委托人身份证反面（不允许复印件，必须为证件有效期内）");
            put(15, "委托结算银行卡正面照片 （结算、补贴非同一张卡）");
            put(16, "委托结算银行卡反面照片 （结算、补贴非同一张卡）");
            put(17, "税务登记证照片（不允许复印件）非三证合一证件提供");
            put(18, "租赁合同");
            put(19, "通道协议照片(反)");
            put(20, "委托清算授权书");
            put(21, "开户许可证(选填)");
        }
    };

    /**
     * 小程序行业一级分类
     */
    public static final Map<String, String> MER_BUSINESS_TYPE = new LinkedHashMap<String, String>() {
        {
            //put("请选择", "0");
            put("1", "餐饮美食");
            put("2", "休闲娱乐");
            put("3", "生活服务");
            put("4", "购物百货");
            put("5", "其他");
        }
    };

    //餐饮美食 二级分类
    public static final List<String> MER_BUSINESS_TYPE_1 = Arrays.asList("中餐", "西餐", "小吃", "异域风味", "火锅烧烤", "糕点饮品", "其他");
    //休闲娱乐 二级分类
    public static final List<String> MER_BUSINESS_TYPE_2 = Arrays.asList("KTV", "网吧游艺", "棋牌桌游", "美容美发", "洗浴足疗", "洗浴足疗", "其他");
    //生活服务 二级分类
    public static final List<String> MER_BUSINESS_TYPE_3 = Arrays.asList("住宿", "话费", "维修", "宠物", "保洁保姆", "其他");
    //购物百货 二级分类
    public static final List<String> MER_BUSINESS_TYPE_4 = Arrays.asList("服装", "便利百货", "水果鲜花", "家具家居", "电子产品", "酒水茶叶", "杂货五金", "汽车电动车", "化妆品珠宝", "其他");
    //其他 二级分类
    public static final List<String> MER_BUSINESS_TYPE_5 = Arrays.asList("其他");

}
