package com.xiaofei.base.map;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/6/27 0027 ProjectName: javatest
 */
public class MapTest {

    private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(2,0.75f);
    public static void main(String[] args) {
        map.put(5, 55);

        new Thread("Thread1") {
            public void run() {
                map.put(7, 77);
                System.out.println(map);
            };
        }.start();
        new Thread("Thread2") {
            public void run() {
                map.put(3, 33);
                System.out.println(map);
            };
        }.start();
    }
    @Test
    public void highestOneBit() {
        int i = 9;
        i |= (i >>  1);
        System.out.println(i);
        i |= (i >>  2);
        System.out.println(i);
        i |= (i >>  4);
        System.out.println(i);
        i |= (i >>  8);
        System.out.println(i);
        i |= (i >> 16);
        System.out.println(i);
        System.out.println( i - (i >>> 1));
    }

    @Test
    public void test2(){
        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();
        map1.put("1","A");
        Map<String,String> map2 = new HashMap<>();
        map2.put("2","B");
        list.add(map1);
        list.add(map2);
        for (Map<String,String> map : list){
            map.put("3","C");
        }
        System.out.println(list);
    }

    @Test
    public void test4(){
        Map<String,String> map1 = new HashMap<>();
        map1.put("A","A");
        String s = map1.get("a");
        System.out.println(s);
    }
}
