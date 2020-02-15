package com.nedeu.zuoye;
/*
* 进程   正在运行的程序
* 线程   线程是进程的一个执行过程，一个进程包含多个线程（至少也有一个线程）
*
* 创建多线程的方式：
*         1 继承Thread类
*         2 实现Runnable接口
*         3 线程池
*
*    如果用继承Thread类或者实现Runnable接口的方式，那么必须重写run方法
*    当执行的时候，调用run方法并不是以线程的方式启动，只是调用了一个方法，要用start方法进行启动线程，启动线程后，该线程运行起来，入口就是run
*    Thread类中有一个方法叫sleep，暂时放弃对CPU的抢占
*    Thread.sleep(500); 表示500毫秒内不去抢占CPU，但是不代表500毫秒后就会执行，而是500毫秒后会继续抢占CPU，能不能马上抢到，并不清楚
*
*   Thread.currentThread()  获取当前正在执行的线程，线程对象下有一个getName()  返回线程名
* */
/*
* Lambda表达式    匿名内部类的变体写法   要求必须有一个接口，并且接口中只能有一个抽象方法！！！
*       接口和抽象类不能实例化，但是接口和抽象类能new
*       匿名内部类：   new 接口或者抽象类
*
* */
public class Test4 {
    public static int a=0;
    public static void main(String[] args) {
        /*MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        MyThread1 myThread2 = new MyThread1();
        myThread2.start();*/

        /*MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
        MyThread2 myThread3 = new MyThread2();
        Thread thread3 = new Thread(myThread2);
        thread3.start();*/

        /*MyInterface add = new Myadd();
        MyInterface jian = new Myjian();
        MyInterface chen = new Mychen();
        MyInterface chu = new Mychu();
        System.out.println(method(10,2,jian));*/

        /*MyInterface add = new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        };*/

        /*System.out.println(method(10,2,new MyInterface() {
            @Override
            public int method(int a, int b) {
                return a+b;
            }
        }));*/

        /*System.out.println(method(10,2,(a,b)->{
            return a+b;
        }));*/

        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1;i<=100;i++){
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"线程输出------"+i);
                }
            }
        });*/

        /*Thread thread = new Thread(()->{
            for (int i = 1;i<=100;i++){
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程输出------"+i);
            }
        });
        thread.start();*/
        for (int i = 0;i<5000;i++){
            Thread thread = new Thread(()->{
                a++;
            });
            thread.start();
        }
        System.out.println(a);
    }
    public static int method(int a,int b,MyInterface myInterface){
        return myInterface.method(a,b);
    }
}
