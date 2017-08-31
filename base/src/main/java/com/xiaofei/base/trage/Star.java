package com.xiaofei.base.trage;

/**
 * 明星类
 * <p>
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
public class Star implements IMovieStar{

    private String name;

    public Star(String name){
        this.name = name ;
    }

    @Override
    public void movieShow(int money) {
        System.out.println(name + " 出演了部片酬 " + money + " 元的电影");
    }

    @Override
    public void tvShow(int money) {
        System.out.println(name + " 出演了部片酬 " + money + " 元的电视");
    }
}
