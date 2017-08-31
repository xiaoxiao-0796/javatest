package com.xiaofei.base.trage;

/**
 * 影星接口，定义影星的基本行为
 * <p>
 * </p>
 * User: xiao Date: 2017/7/19 0019 ProjectName: javatest
 */
public interface IMovieStar {

    /**
     * 演电影
     * @param money
     */
    void movieShow(int money);

    /**
     * 演电视
     * @param money
     */
    void tvShow(int money);
}
