package com.nedeu.zuoye;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test6 {
   /* public static void main(String[] args) {
        *//*
        * 输出斐波那契数列  以 1 1 开头 后面每一位都是前两位之和
        * 1 1 2 3 5 8 13
        *
        * *//*

        System.out.print("输入第几个数字");
        method();
    }
    public  static void method(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==1||n==2){
            System.out.println("1");
        }else {
            int f1 = 1;
            int f2 = 1;
            int sum;
            for (int i = 3;i<=n;i++){
                sum=f1+f2;
                f1 = f2;
                f2 = sum;
            }
            System.out.println(f2);
        }
    }*/

   /* public static void main(String[] args) {
        *//*
        *一个球从100米高度落下，每次落地后反弹到原高度的一半，求第10次落地后 反弹多高
        * *//*
        System.out.print("输入弹了几次");
        method();
    }
    public static void method(){
        double sum = 100;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0;i<n;i++){
            sum  = sum/2;
        }
        System.out.println("距离地面"+sum+"米");
    }*/

   /* public static void main(String[] args) {
        *//*
        *一个整数 加100后是一个完全平方数 再加168也是一个完全平方数 该数是多少
        * *//*
        int i=0,c=1;
        while(c!=0)
        {
            int x=(int) Math.sqrt(i+100);
            int y=(int) Math.sqrt(i+168);
            if(x*x==(i+100)&&y*y==(i+168))
            {
                System.out.println("这个数是："+i);
                c=0;
            }
            i++;
        }
    }*/

    public static void main(String[] args) {
        /*
        * 报数，1，2，3，1，2，3.......报到3移除，
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("参与人数：");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            list.add(i);
        }
        int m = 1;
        while (list.size()>1){
            if (m!=3){
                int first = list.remove(0);
                list.add(first);
                m++;
            }else {
                list.remove(0);
                m=1;
            }
        }
        System.out.println("最后剩下的是："+list.get(0));
    }

}
