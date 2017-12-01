package com.xiaofei.base.model.mediator;

/**
 * 具体同事类A
 */
public class ColleagueA extends Colleague{

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void work(){
        System.out.println("ColleagueA is working");
        getMediator().change(this);
    }

    public void myself(){
        System.out.println("被人影响 work A");
    }
}
