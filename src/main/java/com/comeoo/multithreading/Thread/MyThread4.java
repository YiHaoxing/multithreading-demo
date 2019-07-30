package com.comeoo.multithreading.Thread;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.Thread.MyThread
 * @description TODO
 * @date 2019/7/30 11:52
 */
public class MyThread4 extends Thread{

    private int i = 5;

    public MyThread4(String name){
        this.setName(name);
    }

    @Override
    public void run() {

        while (i >0){
            i--;
            System.out.println(Thread.currentThread().getName()+"减少i的值,i:"+i);
        }
    }

}
