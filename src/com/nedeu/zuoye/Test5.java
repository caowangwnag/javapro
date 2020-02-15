package com.nedeu.zuoye;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Test5 {
    public  static Object obj = new Object();
    public static int a = 0;
    public static void main(String[] args) {
        /*Runnable mythread2 = new MyThread2();
        Thread thread1 = new Thread(mythread2);
        Thread thread2 = new Thread(mythread2);
        thread1.start();
        thread2.start();*/

        /*for (int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"线程输出----"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/


        /*
        *  闭锁
        *      CountDownLatch 创建的时候就加上了锁的数量
        *       CountDownLatch 对象名 = new CountDownLatch(锁的数量)
        *
        *       方法 await() 代表阻塞，等待全部锁解开后，await()则放行
        *
        *       countdown()方法 每调用一次表示解一把锁
        *
        *
        * */

        CountDownLatch countDownLatch = new CountDownLatch(5000);
        Semaphore semaphore = new Semaphore(2);   //信号量
        for (int i = 0;i<5000;i++){
            Thread thread = new Thread(()->{
                /*synchronized (obj){
                    a++;
                    countDownLatch.countDown();
                }*/
                try {
                    semaphore.acquire(2);  //取两个信号量
                    a++;
                    countDownLatch.countDown();
                    semaphore.release(2);  //释放两个信号量
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
