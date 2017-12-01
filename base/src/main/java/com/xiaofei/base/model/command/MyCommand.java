package com.xiaofei.base.model.command;

public class MyCommand implements Command{

    Receive receive;

    public MyCommand(Receive receive){
        this.receive = receive;
    }

    @Override
    public void exe() {
        receive.action();
    }
}
