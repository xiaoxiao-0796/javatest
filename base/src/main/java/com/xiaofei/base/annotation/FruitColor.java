package com.xiaofei.base.annotation;

import java.lang.annotation.*;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/6 0006 ProjectName: javatest
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface FruitColor {

    public static enum Color{RED,BLUE,GREEN};

    Color fruitColor() default Color.GREEN;


}
