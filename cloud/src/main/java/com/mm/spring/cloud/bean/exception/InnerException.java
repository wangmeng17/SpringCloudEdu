package com.mm.spring.cloud.bean.exception;

import lombok.Data;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  10:23
 * @Description:
 */
@Data
public class InnerException extends Exception {
    private String code;
    private String message;

    public InnerException(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
