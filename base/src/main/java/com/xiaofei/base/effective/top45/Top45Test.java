package com.xiaofei.base.effective.top45;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/7/25 0025 ProjectName: javatest
 */
public class Top45Test {

    /**
     * for循环的问题
     */
    @Test
    public void tesyfor1(){
        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks = Arrays.asList(Rank.values());
        for (Iterator<Suit> iterator = suits.iterator();iterator.hasNext();){
            for (Iterator<Rank> i2 = ranks.iterator();i2.hasNext();){
                System.out.println(iterator.next()+"==="+i2.next());
            }
        }
    }

    /**
     * for循环的优化
     */
    @Test
    public void tesyfor2(){
        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks = Arrays.asList(Rank.values());
        for (Iterator<Suit> iterator = suits.iterator();iterator.hasNext();){
            Suit suit = iterator.next();
            for (Iterator<Rank> i2 = ranks.iterator();i2.hasNext();){
                System.out.println(suit +"==="+i2.next());
            }
        }
    }

    /**
     * foreach 完美解决
     */
    @Test
    public void testforeach(){
        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks = Arrays.asList(Rank.values());
        for (Suit s:suits) {
            for (Rank r:ranks){
                System.out.println(s+"==="+r);
            }
        }
    }

    @Test
    public void test(){
         double price = 0.09;
        double sum = 1;
        System.out.println(sum-10*price);
    }

}
