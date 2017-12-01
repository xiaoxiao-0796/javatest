package com.xiaofei.base.model.state;

public class On extends LightState{
    @Override
    void pressSwich(Light light) {
        System.out.println("light on");
        light.setLightState(new Off());
    }
}
