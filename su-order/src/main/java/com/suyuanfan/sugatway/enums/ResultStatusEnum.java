package com.suyuanfan.sugatway.enums;

/**
 * @author SuYuanFan
 * @company 湖南安第斯信息科技有限公司, 版权所有
 * @date 2021/6/4 18:07
 */
public enum ResultStatusEnum {
    SUCCESS("00000", "成功"),
    FAIL("A0001", "失败"),
    USER_ERROR("A0100", "用户名或密码不正确"),
    VERIFY_CODE_ERROR("A0101", "验证码不正确"),
    SESSION_TIMEOUT("A0102", "登录超时"),
    NO_PERMISSION("A0103", "无权限访问"),
    CODE_ERROR("A0104", "code不正确"),
    URL_ERROR("A0200", "请求地址不正确"),
    NOT_VALIDATE("A0201", "参数校验异常"),
    PARAM_NOT_MATCH("A0202", "参数不匹配"),
    PARAM_NOT_NULL("A0203", "参数不能为空"),
    FILE_MAX_SIZE_LIMIT("A0204", "上传文件大小超过限制"),
    FILE_NOT_EXISTS("A0205", "没有上传文件"),
    EXCEL_DATA_EMPTY("A0206", "Excel数据为空"),
    FILE_SUFFIX_NOT_EXISTS("A0207", "没有文件后缀名"),
    FILE_FORMAT_ERROR("A0208", "文件格式错误"),
    ORDER_NOT_EXISTS("A0209", "订单不存在"),
    SERVER_BUSY("B0100", "服务繁忙,请稍后重试"),
    SERVER_TIMEOUT("B0101", "服务连接超时,请稍后再试"),
    NET_ERROR("B0102", "网络异常,请稍后再试");

    private String code;
    private String msg;

    private ResultStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
