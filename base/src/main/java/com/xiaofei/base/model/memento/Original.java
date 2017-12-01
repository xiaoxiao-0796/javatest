package com.xiaofei.base.model.memento;

/**
 * 原始类
 */
public class Original {

    String value;

    public void setValue(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void resetMemento(Memento memento){
        this.value = memento.getValue();
    }
}
