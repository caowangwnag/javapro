package com.nedeu.zuoye;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出------"+i);
            //Thread.currentThread()  获取当前正在执行的线程，线程对象下有一个getName()  返回线程名
        }
    }
}
