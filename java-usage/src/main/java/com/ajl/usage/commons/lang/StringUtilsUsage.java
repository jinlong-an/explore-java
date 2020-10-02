package com.ajl.usage.commons.lang;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author anjinlong
 * @create 2020-10-02 10:30
 * @description description
 */
public class StringUtilsUsage {

    public static void main(String[] args) {
        equalsTest();
        substringTest();
    }

    public static void equalsTest() {
        System.out.println();
        String str1 = "123";
        String str2 = "123";
        System.out.println(StringUtils.equals(str1, str2));

        str1 = null;
        System.out.println(StringUtils.equals(str1, str2));

        try {
            System.out.println(str1.equals(str2));
        } catch (Exception e) {
            System.out.println("演示 空指针异常！");
            e.printStackTrace();
        }
    }

    public static void substringTest() {
        String str = "12345";
        System.out.println("substring 下标从0开始计算");
        System.out.println("StringUtils.substring(str, 1): " + StringUtils.substring(str, 1));
    }

}
