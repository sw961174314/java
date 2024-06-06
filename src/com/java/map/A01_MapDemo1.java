package com.java.map;

import java.util.HashMap;
import java.util.Map;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        // 1.创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        // 2.添加元素
        // put方法的细节:
        // 添加/覆盖
        m.put("测试1", "A");
        m.put("测试2", "B");
        // 在添加数据的时候 如果键不存在 那么直接把键值对对象添加到map集合当中 则put方法会返回null
        System.out.println(m.put("测试3", "C"));
        // 在添加数据的时候 如果键存在 那么会把原有的键值对对象进行覆盖 会把被覆盖的值进行返回
        System.out.println(m.put("测试3", "D"));

        // 3.删除元素
        // 在删除数据的时候 会将键值进行返回
        System.out.println(m.remove("测试3"));

        // 4.清空map
        m.clear();

        // 5.判断是否存在键
        System.out.println(m.containsKey("测试1"));

        // 6.判断是否存在值
        System.out.println(m.containsValue("A"));

        // 7.判断map是否为空
        System.out.println(m.isEmpty());

        // 8.查询map的长度
        System.out.println(m.size());

        // 9.打印集合
        System.out.println(m);
    }
}