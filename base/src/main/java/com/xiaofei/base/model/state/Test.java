package com.xiaofei.base.model.state;

public class Test {
    public static void main(String[] args) {
        Light light = new Light(new Off());

        light.PressSwich();
        light.PressSwich();

        light.PressSwich();

    }
}
