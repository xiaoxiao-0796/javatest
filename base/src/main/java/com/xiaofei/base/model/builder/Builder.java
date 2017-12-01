package com.xiaofei.base.model.builder;

/**
 * 创建者
 */
public abstract class Builder {

    Product product;

    public abstract void builderSize();

    public abstract void builderColour();

    public void initProduct(){
        product = new Product();
    }

}
