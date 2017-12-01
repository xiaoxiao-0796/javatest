package com.xiaofei.base.model.chain;

public class MyHandle extends AbHandle{

    private String num ;

    public MyHandle(String num){
        this.num = num;
    }
    @Override
    public void operation(String num) {
        if (num.equals(this.num)){
            System.out.println(this.num+"do it");
        }else {
            System.out.println(this.num+"do not do it");
            getHandle().operation(num);
        }
    }
}
