package com.xiaofei.base.model.interpreter;

public class Plus implements Interpreter{
    @Override
    public int interpret(Context context) {
        return context.getNum1() + context.getNum2();
    }
}
