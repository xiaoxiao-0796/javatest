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

    @Test
    public void test2(){
        long code = genCode(1);
        System.out.println(code);
    }
    public long genCode(long seed) {
        int arrShift[] =
                {14, 6, 25, 20, 29, 22, 9, 27, 15, 18, 23, 21, 24, 13, 2, 4, 8, 26, 1, 28, 7, 3, 10, 19, 11, 16, 0, 12, 17, 5};
        int arrReplace[] =
                {20, 13, 19, 28, 16, 27, 0, 8, 24, 14, 3, 23, 17, 11, 26, 30, 22, 9, 25, 1, 7, 6, 29, 21, 18, 12, 5, 31, 10, 15, 4, 2};
        int index, bitMask, bitMaskClear;
        long code, tmp, randTime, rand;
        randTime = System.currentTimeMillis() / 1000;
        code = seed + ((randTime - 1356019200) & 1073740800);
        for (int round = 0; round < 7; ++round) {
            tmp = code;
            for (int i = 0; i < 6; ++i) {
                index = ((int) tmp >> (i * 5)) & 31;
                bitMask = arrReplace[index] << (i * 5);
                bitMaskClear = ~(31 << (i * 5));
                code = (code & bitMaskClear) | bitMask;
            }

            tmp = code;
            for (int i = 0; i < 30; ++i) {
                bitMask = (tmp & (1 << arrShift[i])) > 0 ? (1 << i) : 0;
                bitMaskClear = ~(1 << i);
                code = (code & bitMaskClear) | bitMask;
            }
        }
        rand = (int) (Math.random() * 8) + 1;
        code = code | (rand << 30);
        return code;
    }
}
