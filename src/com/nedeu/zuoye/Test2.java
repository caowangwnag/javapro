package com.nedeu.zuoye;
/*
*
* 将d盘下某个文件复制到d盘下的一个文件夹中
*
* 将文件里的东西读到内存中，然后再将内存中的写到文件夹的文件中
* */

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        File from = new File("d:/b.java");
        File parent = new File("d:/a");
        if (!parent.exists()){      //判断该文件夹是否存在，如果不存在则创建
            parent.mkdirs();
        }
        File to = new File("d:/a/"+from.getName());  //from.getName（）是from的文件名
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];  //每次读1K
        try {
            inputStream = new FileInputStream(from);
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream!=null)
                    outputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
