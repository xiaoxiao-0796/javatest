package com.xiaofei.base.model.brige;

public abstract class Brige {

    Sourceable sourceable;

    public void setSource(Sourceable source){
        this.sourceable = source;
    }

    public Sourceable getSourceable() {
        return sourceable;
    }

    public void method(){
        sourceable.method();
    }
}
