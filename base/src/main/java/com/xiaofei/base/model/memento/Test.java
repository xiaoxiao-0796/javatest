package com.xiaofei.base.model.memento;

/**
 *
 */
public class Test {

    public static void main(String[] args) {
        Original original = new Original();
        original.setValue("hello");

        Storage storage = new Storage(original.createMemento());

        System.out.println("init value="+original.getValue());

        original.setValue("bye");

        System.out.println("change value ="+original.getValue());

        original.resetMemento(storage.getMemento());

        System.out.println("reset value="+original.getValue());
    }
}
