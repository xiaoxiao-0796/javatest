package com.xiaofei.base.trage;

/**
 * 经纪人类
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
public class Agent implements IMovieStar{

    private Star star;

    public Agent(Star star){
        this.star = star;
    }

    @Override
    public void movieShow(int money) {
        if (money < 30000000) {
            System.out.println(money + "块钱？！你雇 HuangZiTao 演电影去吧！");
            return;
        }
        star.movieShow(money);
    }

    @Override
    public void tvShow(int money) {
        if (money < 30000000) {
            System.out.println(money + "块钱？！你雇 HuangZiTao 演电视剧去吧！");
            return;
        }
        star.tvShow(money);
    }
}
