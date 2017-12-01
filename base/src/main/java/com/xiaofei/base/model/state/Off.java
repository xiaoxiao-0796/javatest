package com.xiaofei.base.model.state;

public class Off extends LightState {
    @Override
    void pressSwich(Light light) {
        System.out.println("light off");
        light.setLightState(new On());
    }
}
