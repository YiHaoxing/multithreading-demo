package com.comeoo.multithreading.Thread;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.Thread.MyThread
 * @description TODO
 * @date 2019/7/30 11:52
 */
public class MyThread2 extends Thread{

    @Override
    public void run() {

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

}
