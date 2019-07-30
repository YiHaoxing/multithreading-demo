package com.comeoo.multithreading.test;

import com.comeoo.multithreading.Thread.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.BlockingDeque;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.test.MultithreadingDemoTest
 * @description TODO
 * @date 2019/7/30 11:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MultithreadingDemoTest {

    @Test
    public void test01(){
        System.out.println(Thread.currentThread().getName());

        /**
         * 出现了先打印"运行结束",后打印"A"的情况.由此可见,使用多线程时,代码的运行结果与代码执行顺序或调用顺序是无关的.
         */

        MyThread1 myThread = new MyThread1();
        myThread.start();
        System.out.println(Thread.currentThread().getName()+";运行结束");

    }

    @Test
    public void test02(){

        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("myThread2");

        /**
         * 执行到start(),通知"线程规划器",该线程已经准备就绪,等待分配CPU资源执行.并不是表示,执行到这行代码就开始执行这个线程里的run方法.
         */
        myThread2.start();
        /**
         * run()方法其实就是对象调用方法.此时还是由main主线程来调用,此时代码是顺序执行的,必须run()执行完毕才会执行后边的方法.
         */
        //myThread2.run();


        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * start()方法的顺序不表示线程启动的顺序.并不是说先调用start()方法的线程一定会先执行.
     * start()方法只是告诉"线程规划器",我可以执行了.
     */
    @Test
    public void test03(){
        MyThread3 thread1 = new MyThread3(1);
        MyThread3 thread2 = new MyThread3(2);
        MyThread3 thread3 = new MyThread3(3);
        MyThread3 thread4 = new MyThread3(4);
        MyThread3 thread5 = new MyThread3(5);
        MyThread3 thread6 = new MyThread3(6);
        MyThread3 thread7 = new MyThread3(7);
        MyThread3 thread8 = new MyThread3(8);
        MyThread3 thread9 = new MyThread3(9);
        MyThread3 thread10 = new MyThread3(10);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        //执行结果
        //1
        //2
        //3
        //4
        //5
        //6
        //7
        //9
        //8
        //10
    }

    @Test
    public void test04(){
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable1);
        thread.start();

    }

    @Test
    public void test05(){
        MyThread4 a = new MyThread4("A");
        MyThread4 b = new MyThread4("B");
        MyThread4 c = new MyThread4("C");

        a.start();
        b.start();
        c.start();
    }
    @Test
    public void test06(){
        MyThread5 myThread5 = new MyThread5();

        Thread a = new Thread(myThread5, "A");
        Thread b = new Thread(myThread5, "B");
        Thread c = new Thread(myThread5, "C");
        Thread d = new Thread(myThread5, "D");
        Thread e = new Thread(myThread5, "E");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

    @Test
    public void test07() throws InterruptedException {
        MyThread6 myThread6 = new MyThread6();
        //isAlive()判断当前线程是否处于活动状态.活动状态指:线程已经启动且尚未终止.线程处于正在运行或者准备开始运行的状态,就认为是"存活"的
        System.out.println("begin=="+myThread6.isAlive());

        myThread6.start();

        Thread.sleep(1000);

        System.out.println("end=="+myThread6.isAlive());

    }





}
