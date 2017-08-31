package com.xiaofei.base.annotation;

import lombok.ToString;
import org.junit.Test;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/6 0006 ProjectName: javatest
 */
@ToString
public class Apple {

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String appleColor;




    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public String getAppleColor() {
        return appleColor;
    }


    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }

    @Test
    public void toStr(){
        Apple apple = new Apple();
        String appleName = apple.getAppleName();
        String appleColor = apple.getAppleColor();
        System.out.println(appleName+"=="+appleColor);
    }
}
