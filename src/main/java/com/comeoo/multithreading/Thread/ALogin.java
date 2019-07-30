package com.comeoo.multithreading.Thread;

import javax.websocket.OnClose;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.Thread.ALogin
 * @description TODO
 * @date 2019/7/30 15:06
 */
public class ALogin extends Thread{
    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
