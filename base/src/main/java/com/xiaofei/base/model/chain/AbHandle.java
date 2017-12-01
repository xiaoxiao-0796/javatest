package com.xiaofei.base.model.chain;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class AbHandle implements Handle{

    private Handle handle;


    public Handle getHandle(){
        return handle;
    }

    public void setHandle(Handle handle){
        this.handle = handle;
    }

}
