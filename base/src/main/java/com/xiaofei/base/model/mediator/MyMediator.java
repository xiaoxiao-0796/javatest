package com.xiaofei.base.model.mediator;

public class MyMediator implements Mediator{

    private ColleagueA colleagueA;

    private ColleagueB colleagueB;

    public ColleagueA getColleagueA() {
        return colleagueA;
    }

    public void setColleagueA(ColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public ColleagueB getColleagueB() {
        return colleagueB;
    }

    public void setColleagueB(ColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }

    @Override
    public void change(Colleague colleague) {
        if (colleague instanceof ColleagueA) {
            colleagueB.myself();
        }else {
            colleagueA.myself();
        }
    }
}
