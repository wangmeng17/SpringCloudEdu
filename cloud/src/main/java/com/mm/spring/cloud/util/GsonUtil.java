package com.mm.spring.cloud.util;

import com.google.gson.Gson;

/**
 * @Auther: wang.meng
 * @Date: 2018/11/14  15:07
 * @Description:
 */
public class GsonUtil {

    public static <T> String toJson(T t) {
        return new Gson().toJson(t);
    }

    public static <T> T toObject(String json, Class<T> classOfT) {
        return new Gson().fromJson(json, classOfT);
    }
}
