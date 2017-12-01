package com.xiaofei.base.model.builder;

public class BigBuider extends Builder{

    @Override
    public void builderSize() {
        product.setSize("大的");
    }

    @Override
    public void builderColour() {
        product.setColour("red");
    }
}
