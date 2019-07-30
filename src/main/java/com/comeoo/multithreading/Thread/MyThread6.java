package com.comeoo.multithreading.Thread;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.Thread.MyThread
 * @description TODO
 * @date 2019/7/30 11:52
 */
public class MyThread6 extends Thread{

    @Override
    synchronized public void run() {
        System.out.println("run=" + this.isAlive());
    }

}
