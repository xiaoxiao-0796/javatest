package com.xiaofei.base.jna;

import com.sun.jna.Memory;
import com.sun.jna.Native;
import com.sun.jna.Pointer;

public class Test1 {

    public static void main(String[] args) {
        Pointer pointer = new Memory(1024*1024);
        System.out.println("hello");
    }



}
