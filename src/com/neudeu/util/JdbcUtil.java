package com.neudeu.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URL="jdbc:mysql://localhost:3306/db?userUnicode=true&characterEncoding=utf8";
    private static final String USERNAME="root";
    private static final String PASSWORD="123456";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnection(){
        Connection connection = null;
        try {
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    //封装通用增删改
    public static int zenshangai(String sql,Object... obj){
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            preparedStatement = connection.prepareStatement(sql);
            if (obj!=null){
                for (int i = 0;i<obj.length;i++){
                    preparedStatement.setObject(i+1,obj[i]);
                }
            }
            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(preparedStatement,connection);
        }
        return result;
    }
    //封装通用查询方法
    public static <T> List<T> chaxun(String sql,Class<T> tClass,Object... obj){
        List<T> list = new ArrayList<>();
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            if (obj!=null){
                for (int i = 0;i<obj.length;i++){
                    preparedStatement.setObject(i+1,obj[i]);
                }
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                T t = tClass.newInstance();  //通过反射class 调用该类的无参构造创建一个对象
                Field[] fields = tClass.getDeclaredFields(); //获取全部属性（包括私有属性）
                for (Field f:fields){
                    try {
                        // f.getName() 可能和 数据库中的字段名不同
                        // 那么我们就先看 该属性有没有 Column注解  如果有 我们用注解的值当做字段名
                        // 如果没有注解 我们再把 f.getName() 当做字段名
                        // 此刻就要先判断 该属性下 有没有 Column注解
                        String column = f.getName();
                        if (f.isAnnotationPresent(Column.class)){
                            // 如果有 我们就要获取到注解的值 来替换 column的值
                            Column c = f.getAnnotation(Column.class); // 获取注解
                            column = c.value(); //用注解的value 替换 column
                        }
                        Object valus =  resultSet.getObject(column);//属性名和数据库字段名一样，可以把属性名当做数据库里的字段名，
                        // 用 resultSet.getObject(属性名)
                        f.setAccessible(true);//如果该属性是 private 那么在赋值之前必须先打开权限
                        f.set(t,valus);//用 field 调用set方法 可以进行赋值,
                        // 第一个参数,传一个对象,表示为哪个对象的该属性赋值,
                        //第二个参数,传值,表示赋什么样的值
                    }catch (Exception ex){}
                }
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement,connection,resultSet);
        }
        return list;
    }
    //封装关闭方法
    public static void close(PreparedStatement preparedStatement,Connection connection){
        try {
            if (preparedStatement!=null)
                preparedStatement.close();
            if (connection!=null)
                connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(PreparedStatement preparedStatement, Connection connection, ResultSet resultSet){
        try {
            if (resultSet!=null)
                resultSet.close();
            close(preparedStatement,connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
