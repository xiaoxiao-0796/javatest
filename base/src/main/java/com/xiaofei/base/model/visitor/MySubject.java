package com.xiaofei.base.model.visitor;

public class MySubject implements Subject{

    private String value;

    @Override
    public void appect(Visitor visitor) {
        visitor.visit();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
