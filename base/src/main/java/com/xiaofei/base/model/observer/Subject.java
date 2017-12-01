package com.xiaofei.base.model.observer;

public interface Subject {

    void add(Observer observer);

    void del(Observer observer);

    void notifyServer();

    void operation();
}
