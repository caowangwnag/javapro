package com.neudeu.test;

import com.neudeu.pojo.Course;
import com.neudeu.pojo.Student;
import com.neudeu.util.JdbcUtil;
import com.neudeu.util.RowMap;
import com.neudeu.web.StudentWeb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();
        /*List<Course> list = JdbcUtil.chaxun("select Cno,Cname,Period,Ccredit from course",Course.class);
        System.out.println(list);*/

        /*List<Student> list = JdbcUtil.chaxun("select Sno,Sname,Ssex,Sage,Sdept from student", new RowMap<Student>() {
            @Override
            public Student rowMapping(ResultSet resultSet) {
                Student student = new Student();
                try {
                    student.setSno(resultSet.getInt("Sno"));
                    student.setSname(resultSet.getString("Sname"));
                    student.setSsex(resultSet.getString("Ssex"));
                    student.setSage(resultSet.getInt("Sage"));
                    student.setSdept(resultSet.getString("Sdept"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return student;
            }
        });

        System.out.println(list);
    }*/


    }
}
/*
 *  注解 ：
*       在反射过程中
*       为了让 类 属性 方法 等实现某些特定功能 而诞生的
*       写法 @注解名(注解值) 注解值 可以有一个或者多个
*       如何定义一个注解  其实 注解就是 @接口
*       定义注解名是，注解名上方必须写一个注解 @Traget(ElementType.FIELD)
*                   @Traget(ElementType.FIELD)表示注解只能加在属性上
*                    @Traget(ElementType.TYPE)表示注解只能加在类上
*                     @Traget(ElementType.METHOD)表示注解只能加在方法上
*                     @Retention(RetentionPolicy.RUNTIME)表示生命周期，RUNTIME表示在整个生命周期都有效
* */