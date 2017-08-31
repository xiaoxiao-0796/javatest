package com.xiaofei.springbatch;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/8 0008 ProjectName: javatest
 */
@Component("sqlWriter")
public class SqlWriter implements ItemWriter<Student> {

    @Autowired
    private StudentDao studentDao;
    /**
     * 写入数据
     *
     * @param students
     */
    public void write(List<? extends Student> students) throws Exception {
        for (Student student : students) {
            studentDao.save(student);
        }
    }
}
