package com.xiaofei.base.model.builder;

public class Director {
    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construts(){
        builder.initProduct();
        builder.builderColour();
        builder.builderSize();
    }

    public Product getResult(){
        return builder.product;
    }

}
