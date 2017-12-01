package com.xiaofei.base.model.state;

public class Light {

    private LightState lightState;

    public Light(LightState lightState){
        this.lightState = lightState;
    }

    public void PressSwich()
    {
        lightState.pressSwich(this);
    }

    public LightState getLightState() {
        return lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }
}
