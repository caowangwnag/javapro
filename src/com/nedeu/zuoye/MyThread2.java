package com.nedeu.zuoye;
/*
* 线程同步  synchronized (锁旗标（任何一个对象都可以）){
*
* }
*被synchronized包裹的语句，如果要执行，就必须先拿到锁旗标，如果已经被其他线程拿了，就要等待其他线程执行完毕后才能拿到
*synchronized包裹的语句，一次只能被一个线程执行
* synchronized可以加在代码块上，也可以用来修饰方法，如果把synchronized加在方法上，则默认的锁旗标为this
* */

public class MyThread2 implements Runnable{

    private int count = 80;
    Object obj = new Object();
    @Override
    public void run() {
        /*for (int i = 0;i<100;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出------"+i);
            //Thread.currentThread()  获取当前正在执行的线程，线程对象下有一个getName()  返回线程名
        }*/

        while (count>0){
            synchronized (obj){
                System.out.println(Thread.currentThread().getName()+"卖了第"+count+"张票");
                count--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
