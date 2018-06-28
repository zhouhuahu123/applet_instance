package com.applet.api.core.constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
public class MerchantConstants {

    public static final String MER_PIC_SUFFIX = ".jpg";
    //报单类型
    public static final String MER_TYPE_POS = "POS";
    public static final String MER_TYPE_CODE = "CODE";
    //表单校验码
    public static final String MER_TOKEN_NAME = "_token";

    /**
     * 订单状态
     */
    public static final String MER_STATUS_DRAFT_CANCEL = "draft_cancel";//草稿删除
    public static final String MER_STATUS_DRAFT = "draft";//草稿
    public static final String MER_STATUS_BUSINESS_CANCEL = "audit_cancel";//未通过删除
    public static final String MER_AUDIT_STATUS_WAIT = "submit";//待审核
    public static final String MER_AUDIT_STATUS_LEADER_PASS = "leader_passed";//主管审核通过
    public static final String MER_AUDIT_STATUS_LEADER_NOT_PASS = "leader_not_pass";//主管审核驳回
    public static final String MER_AUDIT_STATUS_CENTER_PASS = "center_passed";//中心审核通过
    public static final String MER_AUDIT_STATUS_CENTER_NOT_PASS = "center_not_pass";//中心审核驳回
    public static final String MER_AUDIT_STATUS_THIRD_PASS = "third_passed";//第三方审核通过
    public static final String MER_AUDIT_STATUS_THIRD_NOT_PASS = "third_not_pass";//第三方审核驳回
    //起伏存在的图名称
    public static final String MER_APPLY_PIC_WTJS = "lkl_wt_book|lkl_wt_sqs|mdb_wt_sqs|js_sfz_z|js_sfz_f";//委托结算
    public static final String MER_APPLY_PIC_SZHY = "tax";//三证合一
    public static final String MER_APPLY_PIC_ADDRESS = "lease";//装机地址

    //反馈图片名称
    public static final String MER_FEEDBACK_PIC_NAME_A = "picA";
    public static final String MER_FEEDBACK_PIC_NAME_B = "picB";
    //访问订单方式
    public static final String MER_ORDER_MY = "my";//我的订单
    public static final String MER_ORDER_AUDIT = "audit";//审核订单
    //图片保存文件夹名称
    public static final String MER_PIC_FILE_FEEDBACK = "/resource/upload/shopPic/feedback/";//反馈保存图片路径
    public static final String MER_PIC_FILE_APPLY = "/resource/upload/shopPic/merchantApply/";//报单保存图片路径
    /*
        public static final String MER_PIC_FILE_TEMP = "/resource/upload/shopPic/temp/";//临时保存图片路径
    */
    public static final String MER_PIC_FILE_WEANING = "/resource/upload/shopPic/weaning/";//撤机申请保存图片路径
    /**
     * 撤机申请图片名称
     */
    public static final String MER_WEANING_PIC_NAME = "cjsq";

    //查询审核状态分类
    public static final String QUERY_AUDIT_TYPE_AWAIT = "await";//待审核
    public static final String QUERY_AUDIT_TYPE_ADOPT = "adopt";//已通过
    public static final String QUERY_AUDIT_TYPE_NOT_PASS = "notPass";//未通过
    //默认审核的备注
    public static final String DRAFT_RAMARK = "无";
    //图片来源类型
    public static final Integer MER_PIC_DOUSRCE_APPLY = 0;//小程序报单
    public static final Integer MER_PIC_DOUSRCE_SHOP = 1;//wap报单

    public static final String MER_APPLY_PIC_TYPE = "feedback";
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
     * 报单审核结果集
     */
    public static final Map<String, String> MER_AUDIT_STATUS_MAP = new HashMap<String, String>() {
        {
            put(MER_AUDIT_STATUS_WAIT, "待业务主管审核");
            put(MER_AUDIT_STATUS_LEADER_PASS, "待订单处理中心审核");
            put(MER_AUDIT_STATUS_LEADER_NOT_PASS, "业务主管驳回");
            put(MER_AUDIT_STATUS_CENTER_PASS, "待第三方审核");
            put(MER_AUDIT_STATUS_CENTER_NOT_PASS, "订单处理中心驳回");
            put(MER_AUDIT_STATUS_THIRD_PASS, "第三方审核通过");
            put(MER_AUDIT_STATUS_THIRD_NOT_PASS, "第三方驳回");
        }
    };
    /**
     * app报单审核结果集
     */
    public static final Map<String, String> APP_MER_AUDIT_STATUS_MAP = new HashMap<String, String>() {
        {
            put(MER_AUDIT_STATUS_WAIT, "待审核");
            put(MER_AUDIT_STATUS_LEADER_PASS, "待审核");
            put(MER_AUDIT_STATUS_LEADER_NOT_PASS, "已驳回");
            put(MER_AUDIT_STATUS_CENTER_PASS, "待审核");
            put(MER_AUDIT_STATUS_CENTER_NOT_PASS, "已驳回");
            put(MER_AUDIT_STATUS_THIRD_PASS, "已通过");
            put(MER_AUDIT_STATUS_THIRD_NOT_PASS, "已驳回");
        }
    };

    /**
     * 小程序行业
     */
    public static final Map<String, String> MER_BUSINESS_TYPE = new HashMap<String, String>() {
        {
            put("请选择", "0");
            put("餐饮美食", "1");
            put("酒店娱乐", "2");
            put("生活服务", "3");
            put("其他", "4");
        }
    };


    /**
     * 小程序
     * 拉卡拉经营内容
     */
    public static final Map<String, String> LKL_RUN_CONTENT_MAP = new HashMap<String, String>() {
        {
            put("餐饮、宾馆、娱乐、珠宝金饰、工艺美术品", "1001");
            put("房地产汽车类", "1002");
            put("百货、中介、培训、景区门票等", "1003");
            put("批发类商户", "1004");
            put("加油、超市类", "1005");
            put("交通运输售票", "1006");
            put("水电气缴费", "1007");
            put("政府类", "1008");
            put("便民类", "1009");
            put("公立医院、公立学校、慈善", "1010");
            put("宾馆餐饮娱乐类", "1011");
            put("房产汽车类", "1012");
            put("批发类", "1013");
            put("超市加油类一般类商户", "1014");
            put("一般类商户", "1015");
            put("三农商户", "1016");
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
     * app拉卡拉经营内容
     */
    public static final Map<String, String> APP_LKL_RUN_CONTENT_MAP = new HashMap<String, String>() {
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

}
