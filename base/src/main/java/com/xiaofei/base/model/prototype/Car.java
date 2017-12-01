package com.xiaofei.base.model.prototype;

import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.util.List;

@Getter
@Setter
public class Car implements Serializable,Cloneable{

    private String size;

    private Fruit fruit;

    public Car clone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ByteArrayInputStream bis;
        ObjectInputStream ois = null;
        Car car = null;
        try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }

        bis = new ByteArrayInputStream(bos.toByteArray());
        try {
            ois = new ObjectInputStream(bis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            car =  (Car) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }


    public Car clone1() throws CloneNotSupportedException {
        return  (Car) super.clone();
    }
}
