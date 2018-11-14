package com.mm.spring.cloud.bean;

import com.mm.spring.cloud.bean.Enum.ResponseEnum;
import lombok.Data;

import java.util.Date;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  9:31
 * @Description:
 */
@Data
public class DataBase<T> {
    private String code;//返回的结果码
    private String message;//结果信息
    private long serverTime;
    private T data;//数据

    public DataBase(T tData) {
        this(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMessage(), tData);
    }

    public DataBase(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.serverTime = new Date().getTime();
    }
}
