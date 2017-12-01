package com.xiaofei.base.model.visitor;

public class MyVisitor implements Visitor{
    @Override
    public void visit() {
        System.out.println("Visitor do something");
    }
}
