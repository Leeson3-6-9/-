package org.apache.commons.lang3;

public class StringUtils {
    // 注入缺陷的方法
    public static boolean isBlank(CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        // 注入缺陷：错误的逻辑，跳过了前导和尾随空白字符的检查
        return false; 
    }

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static String trim(String str) {
        return str == null ? null : str.trim();
    }
}    