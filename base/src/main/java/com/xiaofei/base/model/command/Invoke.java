package com.xiaofei.base.model.command;

public class Invoke {

    Command command;

    public Invoke(Command command){
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
