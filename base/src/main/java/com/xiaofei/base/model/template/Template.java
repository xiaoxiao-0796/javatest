package com.xiaofei.base.model.template;

public abstract class Template {

public final int calculate(String exg,String opt){
    int array[] = spilt(exg,opt);
    return docalculate(array[0],array[1]);
}

    protected abstract int docalculate(int i, int i1);

    int[] spilt(String exg, String opt){
        String[] split = exg.split(opt);
        int[] arr = new int[2];

        arr[0] = Integer.parseInt(split[0]);
        arr[1] = Integer.parseInt(split[1]);
        return arr;
    };
}
