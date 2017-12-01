package com.xiaofei.base.model.prototype;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
//        List<String> list = new ArrayList<>();
//        list.add("hello");
//        Fruit fruit = new Fruit();
//        fruit.setApple("红富士");
//        fruit.setBalanas(list);
//        Fruit fruit1 = fruit.clone();
//        System.out.println("fruit:"+fruit.getBalanas().hashCode());
//        System.out.println("friut:"+fruit1.getBalanas().hashCode());

        Car car = new Car();
        car.setSize("23");
        car.setFruit(new Fruit());
        Car car1 = car.clone();
        System.out.println(car.getFruit());
        System.out.println(car1.getFruit());

        Car car2 = car.clone1();
        System.out.println(car.getFruit());
        System.out.println(car2.getFruit());

        List<String> list1 = new ArrayList<>();
        List<String> list = new ArrayList<>();

    }
}
