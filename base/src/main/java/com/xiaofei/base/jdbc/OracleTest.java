package com.xiaofei.base.jdbc;

import org.junit.Test;

import java.sql.*;

public class OracleTest {


    /**
     * 一个非常标准的连接Oracle数据库的示例代码
     */
    @Test
    public void testOracle()
    {
        Connection con = null;// 创建一个数据库连接
        PreparedStatement pre = null;// 创建预编译语句对象，一般都是用这个而不用Statement
        ResultSet result = null;// 创建一个结果集对象
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
            System.out.println("开始尝试连接数据库！");
            String url = "jdbc:oracle:thin:@116.228.151.161:16410/test10";// 127.0.0.1是本机地址，XE是精简版Oracle的默认数据库名
            String user = "pcpf_app";// 用户名,系统默认的账户名
            String password = "bestpay";// 你安装时选设置的密码
            con = DriverManager.getConnection(url, user, password);// 获取连接
            System.out.println("连接成功！");
            String sql="insert into t_sym_staff(STAFF_ID,STAFF_CODE,staff_name,org_id,pwd_stat,PWD_CTRL,stat) \n" +
                    "values(?,?,?,?,?,?,?)";
            pre = con.prepareStatement(sql);
            pre.setString(1,"9999999999");
            pre.setString(2,"d'ede&");
            pre.setString(3,"<wsws/>");
            pre.setInt(4,9090);
            pre.setString(5,"S0A");
            pre.setString(6,"s0o");
            pre.setString(7,"S0A");
            int update = pre.executeUpdate();
            System.out.println("更新数为："+update);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                // 逐一将上面的几个对象关闭，因为不关闭的话会影响性能、并且占用资源
                // 注意关闭的顺序，最后使用的最先关闭
                if (result != null)
                    result.close();
                if (pre != null)

                    pre.close();
                if (con != null)
                    con.close();
                System.out.println("数据库连接已关闭！");
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    private void queryone(Connection con,PreparedStatement pre,ResultSet result) throws SQLException {
        String sql = "select * from t_sym_staff where staff_id=?";// 预编译语句，“？”代表参数
        pre = con.prepareStatement(sql);// 实例化预编译语句
        pre.setString(1, "zhangjia");// 设置参数，前面的1表示参数的索引，而不是表中列名的索引
        result = pre.executeQuery();// 执行查询，注意括号中不需要再加参数
        while (result.next())
            // 当结果集不为空时
            System.out.println( "姓名:"
                    + result.getString("staff_name"));
    }
}
