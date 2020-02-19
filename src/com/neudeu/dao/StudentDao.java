package com.neudeu.dao;

import com.neudeu.pojo.Student;
import com.neudeu.util.JdbcUtil;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao {
    /*String url = "jdbc:mysql://localhost:3306/db?userUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "123456";
    Connection connection = null;
    PreparedStatement preparedStatement = null;*/
    @Override
    public List<Student> query() {
        List<Student> list = new ArrayList<>();
        /*ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement = connection.prepareStatement("select Sno,Sname,Ssex,Sage,Sdept from student");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Student student = new Student();
                student.setSno(resultSet.getInt("Sno"));
                student.setSname(resultSet.getString("Sname"));
                student.setSsex(resultSet.getString("Ssex"));
                student.setSage(resultSet.getInt("Sage"));
                student.setSdept(resultSet.getString("Sdept"));
                list.add(student);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet!=null)
                    resultSet.close();
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
        /*String sql = "select Sno,Sname,Ssex,Sage,Sdept from student";
        Class<Student> tClass = Student.class;
         list = JdbcUtil.chaxun(sql,tClass);
        return list;*/
        return JdbcUtil.chaxun("select Sno,Sname,Ssex,Sage,Sdept from student",Student.class);
    }

    @Override
    public int add(Student student) {
        List<Student> list = new ArrayList<>();
        /*int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement = connection.prepareStatement("insert into student(Sname,Ssex,Sage,Sdept) values(?,?,?,?)");
            preparedStatement.setString(1,student.getSname());
            preparedStatement.setString(2,student.getSsex());
            preparedStatement.setInt(3,student.getSage());
            preparedStatement.setString(4,student.getSdept());
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

        /*String sql = "insert into student(Sname,Ssex,Sage,Sdept) values(?,?,?,?)";
        Object[] obj = {student.getSname(),student.getSsex(),student.getSage(),student.getSdept()};
        int i = JdbcUtil.zenshangai(sql,obj);
        return i;*/
        return JdbcUtil.zenshangai("insert into student(Sname,Ssex,Sage,Sdept) values(?,?,?,?)",student.getSname(),student.getSsex(),student.getSage(),student.getSdept());
    }

    @Override
    public int update(Student student) {
        List<Student> list = new ArrayList<>();
        /*int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement = connection.prepareStatement("update student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?");
            preparedStatement.setString(1,student.getSname());
            preparedStatement.setString(2,student.getSsex());
            preparedStatement.setInt(3,student.getSage());
            preparedStatement.setString(4,student.getSdept());
            preparedStatement.setInt(5,student.getSno());
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

        /*String sql = "update student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?";
        Object[] obj = {student.getSname(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno()};
        int i = JdbcUtil.zenshangai(sql,obj);
        return i;*/
        return JdbcUtil.zenshangai("update student set Sname=?,Ssex=?,Sage=?,Sdept=? where Sno=?",student.getSname(),student.getSsex(),student.getSage(),student.getSdept(),student.getSno());
    }

    @Override
    public int del(int Sno) {
        List<Student> list = new ArrayList<>();
        /*int i = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement = connection.prepareStatement("delete from student where Sno=?");
            preparedStatement.setInt(1,Sno);
            i = preparedStatement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement!=null)
                    preparedStatement.close();
                if (connection!=null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

        /*String sql = "delete from student where Sno=?";
        Object[] obj = {Sno};
        int i = JdbcUtil.zenshangai(sql,obj);
        return i;*/
        return JdbcUtil.zenshangai("delete from student where Sno=?",Sno);
    }

    @Override
    public Student queryOne(int Sno) {
        return null;
    }
}
