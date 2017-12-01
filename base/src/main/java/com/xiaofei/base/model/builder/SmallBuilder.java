package com.xiaofei.base.model.builder;

public class SmallBuilder extends Builder{

    @Override
    public void builderSize() {
        product.setSize("小的");
    }

    @Override
    public void builderColour() {
        product.setColour("blue");
    }
}
