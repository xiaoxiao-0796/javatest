package com.xiaofei.base.model.mediator;

public class ColleagueB extends Colleague{

    public ColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void work(){
        System.out.println("ColleagueB is working");
        getMediator().change(this);
    }

    public void myself(){
        System.out.println("被人影响 work B");
    }

}
