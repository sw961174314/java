package com.java.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        // 键值对(Map集合的第二种遍历方式)

        // 1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        // 2.添加元素
        map.put("测试1", "A");
        map.put("测试2", "B");
        map.put("测试3", "C");
        map.put("测试4", "D");

        // 3.1 通过一个方法获取所有的键值对对象 会返回一个Set对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 3.2 遍历entries集合 得到里面每一个键值对对象
        for (Map.Entry<String, String> entry : entries) {
            // 3.3 利用entry调用get方法来获取键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }

        // 课堂练习
        // 练习一:利用键值对的方式遍历map集合(要求:装着键值对的单列集合使用增强for进行遍历)
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "-" + value);
        }
        // 练习二:利用键值对的方式遍历map集合(要求:装着键值对的单列集合使用迭代器进行遍历)
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }
        // 练习三:利用键值对的方式遍历map集合(要求:装着键值对的单列集合使用lambda表达式进行遍历)
        entries.forEach(entry -> {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        });
    }
}