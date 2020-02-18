package com.neudeu.web;

import com.neudeu.pojo.Student;
import com.neudeu.service.IstudentService;
import com.neudeu.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    IstudentService studentService = new StudentService();
    public void showmain(){
        System.out.println("---------------------------");
        System.out.println("1-----------------------查询");
        System.out.println("2-----------------------添加");
        System.out.println("3-----------------------修改");
        System.out.println("4-----------------------删除");
        System.out.println("其他--------------------退出");
        System.out.println("---------------------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==1){
            query();
        }else if (i==2){
            add(scanner);
        }else if (i==3){
            update(scanner);
        }else if (i==4){
            del(scanner);
        }else{
            System.exit(0);
        }
    }
    private void query(){
        List<Student> list =  studentService.query();
        for (Student student:list){
            System.out.println(student);
        }
    }
    private void add(Scanner scanner){
        System.out.print("请输入要添加的名字：");
        String name = scanner.next();
        System.out.print("请输入要添加的性别：");
        String sex = scanner.next();
        System.out.print("请输入要添加的年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入要添加的系：");
        String dept = scanner.next();
        Student student = new Student(name,sex,age,dept);
        studentService.add(student);
        query();
    }
    private void update(Scanner scanner){
        System.out.print("请输入要修改的学号：");
        int no = scanner.nextInt();
        System.out.print("请输入要修改的名字：");
        String name = scanner.next();
        System.out.print("请输入要修改的性别：");
        String sex = scanner.next();
        System.out.print("请输入要修改的年龄：");
        int age = scanner.nextInt();
        System.out.print("请输入要修改的系：");
        String dept = scanner.next();
        Student student = new Student(no,name,sex,age,dept);
        studentService.update(student);
        query();
    }
    private void del(Scanner scanner){
        System.out.print("请输入要删除的学号：");
        int no = scanner.nextInt();
        studentService.del(no);
        query();
    }
}
