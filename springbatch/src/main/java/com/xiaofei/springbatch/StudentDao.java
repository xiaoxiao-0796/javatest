package com.xiaofei.springbatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 类描述
 * <p>
 * 方法描述列表
 * </p>
 * User: xiao Date: 2017/8/8 0008 ProjectName: javatest
 */
@Repository
public class StudentDao {

    private static final String SAVE_SQL ="insert INTO student(id,name,age,score) VALUES (?,?,?,?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(final Student student){
        jdbcTemplate.update(SAVE_SQL, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
                preparedStatement.setInt(1,student.getId());
                preparedStatement.setString(2,student.getName());
                preparedStatement.setInt(3,student.getAge());
                preparedStatement.setInt(4,student.getScore());
            }
        });
    }
}
