package com.xiaofei.base.model.strategy;

public class Plus implements Calculate{

    @Override
    public Long doCalculate(long num1, long num2) {
        return num1+num2;
    }
}
