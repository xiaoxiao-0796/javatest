package com.xiaofei.base.effective.Top39;

import java.util.Date;

/**
 * 必要时进行保护性拷贝
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
public final class Tip39 {

    private final Date start;

    private final Date end;

    public Tip39(Date start,Date end){
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (start.compareTo(end)>0){
            throw new IllegalArgumentException(start+"after"+end);
        }
//        this.start = start;
//        this.end = end;
    }

    public Date getStart(){
        return new Date(start.getTime());
    }

    public Date getEnd(){
        return new Date(end.getTime());
    }


}
