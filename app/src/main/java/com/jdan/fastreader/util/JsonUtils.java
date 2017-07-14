package com.jdan.fastreader.util;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * author : nan
 * time : 2016/3/17.
 */
public class JsonUtils {
    /**
     * 解析Json
     * @param jsonStr
     * @param T
     * @param <T>
     * @return
     */
    public static <T>T parseJson(String jsonStr,Class<T> T) {
        Gson gson = new Gson();
        T bean =gson.fromJson(jsonStr,T);
        return bean;
    }

    /**
     * 解析Json
     * @param jsonStr
     * @param typeToken
     * @param <T>
     * @return
     */
    public static <T>T parseJson(String jsonStr,Type typeToken) {
        Gson gson = new Gson();
        T bean =gson.fromJson(jsonStr, typeToken);
        return bean;
    }

    /**
     * 创建一个json字符串
     * @param obj
     * @return
     */
    public static String createJsonString(Object obj){
        Gson gson = new Gson();
        String jsonStr=gson.toJson(obj);
        return jsonStr;
    }
}
