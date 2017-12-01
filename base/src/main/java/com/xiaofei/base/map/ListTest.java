package com.xiaofei.base.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListTest {

    public static void main(String[] args) {

        String regex;
        Pattern p;
        Matcher m;
        List<String> list = new ArrayList();
        list.add("aa");
        list.add("ee");
        list.add("aa");
        list.add("aa");
        list.add("aa");
        list.add("bb");
        list.add("bb");
        list.add("cc");
        list.add("cc");
        list.add("dd");
        list.add("ed");
        String tmp = "";
        String tot_str = list.toString();

        Set<String> set = new TreeSet<>(list);
        //System.out.println(tot_str);   //[aa, aa, aa, aa, bb, bb, cc, cc, dd, ed]
        int max_cnt = 0;
        String max_str = "";
        for (String str : set) {
            if (tmp.equals(str)) continue;
            tmp = str;
            regex = str;
            p = Pattern.compile(regex);
            m = p.matcher(tot_str);
            int cnt = 0;
            while (m.find()) {
                cnt++;
            }
            //System.out.println(str + ":" + cnt);
            if (cnt > max_cnt) {
                max_cnt = cnt;
                max_str = str;
            }
        }
        System.out.println("字符串 " + max_str + " 出现的最大次数：" + max_cnt);  //字符串 aa 出现的最大次数：4
    }
}
