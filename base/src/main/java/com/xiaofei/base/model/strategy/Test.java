package com.xiaofei.base.model.strategy;

/**
 * 策略模式的决定权在用户，
 * 系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。
 * 因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 */
public class Test {

    public static void main(String[] args) {
        Calculate calculate = new Multiply();
        Long aLong = calculate.doCalculate(3, 6);
        System.out.println("result="+aLong);
    }
}
