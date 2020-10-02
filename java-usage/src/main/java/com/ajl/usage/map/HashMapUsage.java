package com.ajl.usage.map;

import java.util.HashMap;

/**
 * @Author anjinlong
 * @create 2020-10-01 20:28
 * @description description
 */
public class HashMapUsage {

    public static void main(String[] args) {
        putAllTest();
    }

    public static void putAllTest() {
        System.out.println("putAll 将map2的数据全部放入到map1中，如果map1中已经存在key则更新，如果不存在则插入。");

        HashMap<String, String> map1 = new HashMap();
        HashMap<String, String> map2 = new HashMap();

        for (int i = 1; i < 5; i++) {
            map1.put("key" + i, String.valueOf(i));
            map2.put("key" + i, String.valueOf(i * 10));
        }
        System.out.println("before: =======================");
        map1.keySet().stream().forEach(key -> System.out.println(key + " : " + map1.get(key)));
        map2.keySet().stream().forEach(key -> System.out.println(key + " : " + map2.get(key)));

        map1.putAll(map2);

        System.out.println("after: =======================");
        map1.keySet().stream().forEach(key -> System.out.println(key + " : " + map1.get(key)));
        map2.keySet().stream().forEach(key -> System.out.println(key + " : " + map2.get(key)));

    }
}
