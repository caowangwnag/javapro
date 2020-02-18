package com.LX.lianxi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test5 {
    /**
     *   jdbc 和  Navicat 的用法实际上是一样的
     *   看似形式不同一个是用代码，一个是视图画面
     *  但是实质上是一回事，流程完全相同
     *
     * */
    /*
    *
    * Navicat中：                                             jdbc（java）中：
    *   1 文件->新建->mysql  选择要连接数据库的种类                 1  加载驱动  连哪种数据库就要加载哪种驱动
    *   2 新建连接  通过 主机ip或者主机名  端口号  用户名  密码      2 创建连接 通过DriverManager类来实现
    *   3 选择要操作哪一个数据库                                    3  jdbc中 要操作的库已经包含在url中了
    *   4  创建一个可以写sql语句的地方                              4  创建一个可以写sql语句的地方
    *   5 写sql语句                                                5 在jdbc中 该操作 包含在 创建 PreparedStatement中了
    *   6 执行sql语句 看结果                                        6 如果是增删改查 则用 PreparedStatement对象调用  executeUpdate方法 返回int (受影响的行数)
    *                                                                如果是查询 则用 PreparedStatement对象调用  executeQuery 返回ResultSet对象 (结果集)
    *
    * */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db?userUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //  1 文件->新建->mysql  选择要连接数据库的种类
            // 加载驱动  连哪种数据库就要加载哪种驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 2 新建连接  通过 主机ip或者主机名  端口号  用户名  密码
            // 创建连接 通过DriverManager类来实现
            connection = DriverManager.getConnection(url,username,password);
            // 3 选择要操作哪一个数据库
            // jdbc中 要操作的库已经包含在url中了

            // 4 创建一个可以写sql语句的地方
            preparedStatement = connection.prepareStatement("insert into student(Sname,Ssex,Sage,Sdept) values ('李四','男',20,'计算机系')");
            // 5 写sql语句
            // 在jdbc中 该操作 包含在 创建 PreparedStatement中了

            // 6 执行sql语句 看结果
            // 如果是增删改查 则用 PreparedStatement对象调用  executeUpdate方法 返回int (受影响的行数)
            // 如果是查询 则用 PreparedStatement对象调用  executeQuery 返回ResultSet对象 (结果集)
            int i = preparedStatement.executeUpdate();
            System.out.println(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 对于 con 和 PreparedStatement来说 都是资源 使用后要进行关闭
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
