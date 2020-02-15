package com.nedeu.zuoye;

import java.io.*;
/*       *    字节输出流 OutputStream
         *    字节输入流 InputStream
         *    字符输入流 Reader  BufferedReader(可以实现按行读)
         *    字符输出流 Writer
*/
public class Test1 {
    public static void main(String[] args) {
        File file = new File("d:/a");
        File file1 = new File("d:/b.java");
//        System.out.println(file.exists());
        System.out.println(file.mkdir());


       /* try {
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            OutputStream outputStream = new FileOutputStream(file1,true);
            String a = "\nhhhhhhhhhh";
            outputStream.write(a.getBytes());  //将数据放入流中（管道中）
            outputStream.flush();  //将管道中的数据压入文件中
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        /*InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file1);
            byte[] a = new byte[30];
            int b = inputStream.read(a);
            while (b!=-1){
                System.out.println("读了"+b+"个");
                System.out.println(new String(a,0,b));  //new String(传a，从0开始，截取到b)
                b = inputStream.read(a);
            }
//            System.out.println(inputStream.read(a));  //读出有多少个
//            System.out.println(new String(a));     //new String将byte数组a转化为字符串
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/




//        char[] a = new char[30];
        /*Reader reader = null;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(file1);
            bufferedReader = new BufferedReader(reader);   //实现按行读
            String str = bufferedReader.readLine();
            while (str!=null){
                System.out.println(str);
                str = bufferedReader.readLine();
            }
            *//*int b = reader.read(a);
            while (b!=-1){
                System.out.println("读了"+b+"个");
                System.out.println(new String(a,0,b));
                b = reader.read(a);
            }*//*
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader!=null)
                    bufferedReader.close();
                if (reader!=null)
                    reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/


        Writer writer = null;
        try {
            writer = new FileWriter(file1,true);
            writer.write("\n666666666");  //将数据放入流中
            writer.flush(); //将管道中的数据压入文件中
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (writer!=null)
                    writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
