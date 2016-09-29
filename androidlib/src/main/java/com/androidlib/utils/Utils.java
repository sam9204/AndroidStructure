package com.androidlib.utils;

/**
 * 通用工具类
 *
 * Created by cws on 16/9/25.
 */

public class Utils {


    /**
     * 安全转换Int方法
     * @param value
     * @param defaultValue
     * @return
     */
    public final static int converToInt(Object value, int defaultValue) {
        if (value == null || "".equals(value.toString().trim())) {
            return defaultValue;
        }
        try {
            return Integer.valueOf(value.toString());
        } catch (Exception e) {
            try {
                return Double.valueOf(value.toString()).intValue();
            } catch (Exception e1s) {
                return defaultValue;
            }
        }

    }

}
