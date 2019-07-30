package com.comeoo.multithreading.Thread;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.Thread.MyThread
 * @description TODO
 * @date 2019/7/30 11:52
 */
public class MyThread5 extends Thread{

    private int i = 5;

    @Override
    synchronized public void run() {
        i--;
        System.out.println(Thread.currentThread().getName()+"减少i的值,i:"+i);

    }

}
