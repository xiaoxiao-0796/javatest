package com.xiaofei.base.model.observer;

import java.util.Vector;

public abstract class AbSubject implements Subject{

    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyServer() {
        for (Observer o:vector) {
            o.update();
        }
    }

}
