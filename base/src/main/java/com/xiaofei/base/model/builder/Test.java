package com.xiaofei.base.model.builder;

public class Test {

    public static void main(String[] args) {
        Builder builder = new BigBuider();
        Director director = new Director(builder);
        director.construts();
        Product product = director.getResult();
        System.out.println(product);

    }
}
