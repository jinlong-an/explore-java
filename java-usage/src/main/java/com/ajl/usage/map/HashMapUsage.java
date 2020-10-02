package com.ajl.usage.map;

import java.util.HashMap;

/**
 * @Author anjinlong
 * @create 2020-10-01 20:28
 * @description description
 */
public class HashMapUsage {

    public static void main(String[] args) {
        testPutAll();
    }

    public static void testPutAll() {

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
