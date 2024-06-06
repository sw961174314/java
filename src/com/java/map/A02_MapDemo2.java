package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        // 键找值(Map集合的第一种遍历方式)

        // 1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        // 2.添加元素
        map.put("测试1", "A");
        map.put("测试2", "B");
        map.put("测试3", "C");
        map.put("测试4", "D");

        // 3.1获取所有的键 把这些键放到一个单列集合中
        Set<String> keys = map.keySet();
        // 3.2遍历单列集合
        for (String key : keys) {
            System.out.println(key);
            // 3.3利用map集合中的值获取对应的值
            System.out.println(map.get(key));
        }

        // 课堂练习
        // 练习一:利用键找值的方式遍历map集合(要求:装着键的单列集合使用增强for进行遍历)
        for (String key : keys) {
            System.out.println(key + "-" + map.get(key));
        }
        // 练习二:利用键找值的方式遍历map集合(要求:装着键的单列集合使用迭代器进行遍历)
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + "-" + map.get(key));
        }
        // 练习三:利用键找值的方式遍历map集合(要求:装着键的单列集合使用lambda表达式进行遍历)
        keys.forEach(key -> {
            System.out.println(key + "-" + map.get(key));
        });
    }
}