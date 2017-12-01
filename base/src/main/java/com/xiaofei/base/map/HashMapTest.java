package com.xiaofei.base.map;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        map.put("123","a");
        map.put("456","b");
        map.get("123");
    }
}
