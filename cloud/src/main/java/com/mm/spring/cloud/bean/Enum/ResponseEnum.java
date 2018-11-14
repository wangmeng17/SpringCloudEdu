package com.mm.spring.cloud.bean.Enum;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  9:42
 * @Description:
 */
public enum ResponseEnum {
    SUCCESS("10000200", "成功"),
    FAILURE("10001001", "服务器错误");

    private String code;
    private String message;

    ResponseEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
