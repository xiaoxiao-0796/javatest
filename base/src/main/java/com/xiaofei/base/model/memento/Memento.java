package com.xiaofei.base.model.memento;

/**
 * Memento 备忘录类
 */
public class Memento {

    private String value;

    public Memento(String value){
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
