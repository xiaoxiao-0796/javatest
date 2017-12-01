package com.xiaofei.base.model.command;

/**
 *命令模式
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开
 */
public class Test {

    public static void main(String[] args) {
        Receive receive = new Receive();
        Command command = new MyCommand(receive);
        Invoke invoke = new Invoke(command);
        invoke.action();
    }
}
