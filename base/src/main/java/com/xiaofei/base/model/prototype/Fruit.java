package com.xiaofei.base.model.prototype;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
public class Fruit implements Cloneable,Serializable{

    private String apple;

    private List<String> balanas;


    /**
     * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     * @return
     * @throws CloneNotSupportedException
     */
    public Fruit clone() throws CloneNotSupportedException {
        return  (Fruit) super.clone();
    }

}
