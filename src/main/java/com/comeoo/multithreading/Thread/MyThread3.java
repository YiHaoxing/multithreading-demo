package com.comeoo.multithreading.Thread;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.Thread.MyThread
 * @description TODO
 * @date 2019/7/30 11:52
 */
public class MyThread3 extends Thread{

    private int i;

    public MyThread3(){}
    public MyThread3(int i){
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }

}
