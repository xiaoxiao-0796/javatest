package com.xiaofei.base.model.interpreter;


/**
 * 解释器模式
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context();
        context.setNum1(123);
        context.setNum2(23);
        int interpret = new Plus().interpret(context);

        System.out.println(interpret);
    }
}
