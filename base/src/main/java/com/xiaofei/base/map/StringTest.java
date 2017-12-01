package com.xiaofei.base.map;

import org.junit.Test;

public class StringTest {

    public static void main(String[] args) {
        char[] chars= {'s','t','r','i','n','g'};
        System.out.println(chars.length);
        String s = new String(chars,5,0);
        System.out.println(s);

        byte[] bytes = {1,2,3,4,5};
        String s1 = new String(bytes,0,0,bytes.length);
        System.out.println(s1);
        String s2 = "hello";
        String s3 = s2.replace('l', 'y');
        System.out.println(s3);
    }

    @Test
    public void test(){
        String[]  s  = new String[2];
        s[0] = "12";
        for (String ss:s
             ) {
            System.out.println(ss);
        }


    }

}
