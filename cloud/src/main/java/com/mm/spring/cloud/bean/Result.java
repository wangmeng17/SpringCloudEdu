package com.mm.spring.cloud.bean;

import com.mm.spring.cloud.bean.Enum.ResponseEnum;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  10:30
 * @Description:
 */
public class Result {

    public static <T> DataBase<T> OK(T tData) {
        return new DataBase(tData);
    }

    public static DataBase FAILURE() {
        return new DataBase(ResponseEnum.FAILURE.getCode(), ResponseEnum.FAILURE.getMessage(), null);
    }
}
