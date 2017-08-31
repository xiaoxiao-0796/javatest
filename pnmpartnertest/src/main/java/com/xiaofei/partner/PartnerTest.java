package com.xiaofei.partner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/9 0009 ProjectName: javatest
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class PartnerTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test                //
    public void partner() throws FileNotFoundException {
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(new File("E:\\123.txt"))));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(new File("E:\\partner.txt"))))){
            String sql = null;
            while ((sql = bufferedReader.readLine())!=null){
                int update = jdbcTemplate.update(sql);
                if (update==1){
                    bufferedWriter.write(sql);
                    bufferedWriter.write(";");
                    bufferedWriter.newLine();
                }else {
                   // System.out.println(sql);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
