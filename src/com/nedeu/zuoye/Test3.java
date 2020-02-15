package com.nedeu.zuoye;
/*
* 将一个Java对象保存到硬盘中
*  OutputStream     ObjectOutputStream
* 该java对象必须是可序列化对象
*       序列化    把一个对象转换为字节流，这一过程叫做序列化
*       反序列化    把字节流或字符流转化为对象，这一过程叫做反序列化
*
*       让对象成为可序列化对象     在类上实现序列化接口即可  java.io.serializable
*                              同时类上必须有一个序列化UID
*
*        将序列化后的对象读取出来    ObjectIntputStream    IntputStream
* */

import java.io.*;

public class Test3 {
    public static void main(String[] args) {

        /*Student student = new Student();
        student.setAge(20);
        student.setId(10);
        student.setName("张三");
        student.setGrade("一班");

        File file = new File("d:/student");
        OutputStream outputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.flush();
            outputStream.flush();
            System.out.println("保存完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream!=null)
                    objectOutputStream.close();
                if (outputStream!=null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        File file = new File("d:/student");
        InputStream inputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            inputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(inputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream!=null)
                    objectInputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
