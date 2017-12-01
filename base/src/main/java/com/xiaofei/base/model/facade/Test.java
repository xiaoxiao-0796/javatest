package com.xiaofei.base.model.facade;


/**
 * 简单来说，该模式就是把一些复杂的流程封装成一个接口供给外部用户更简单的使用。这个模式中，设计到3个角色。

 　　1）.门面角色：外观模式的核心。它被客户角色调用，它熟悉子系统的功能。内部根据客户角色的需求预定了几种功能的组合。

 　　2）.子系统角色:实现了子系统的功能。它对客户角色和Facade时未知的。它内部可以有系统内的相互交互，也可以由供外界调用的接口。

 　　3）.客户角色:通过调用Facede来完成要实现的功能。

 　　使用场景：

 　　1- 为复杂的模块或子系统提供外界访问的模块；

 　　2- 子系统相互独立；

 　　3- 在层析结构中，可以使用外观模式定义系统的每一层的入口。
 */
public class Test {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
