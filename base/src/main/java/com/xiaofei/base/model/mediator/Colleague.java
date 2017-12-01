package com.xiaofei.base.model.mediator;

/**
 * 抽象同事类
 */
public abstract class Colleague {
    //持有中介者对象
    private Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
