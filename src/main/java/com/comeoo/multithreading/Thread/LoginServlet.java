package com.comeoo.multithreading.Thread;

/**
 * @author YiHaoXing
 * @version 1.0.0
 * @className com.comeoo.multithreading.Thread.LoginServlet
 * @description TODO
 * @date 2019/7/30 15:03
 */
public class LoginServlet {
    private static String username1;
    private static String password1;

    synchronized public static void doPost(String username,String password){
        try {
            username1 = username;

            if(username.equals("a")){
                Thread.sleep(5000);
            }

            password1 = password;

            System.out.println("username="+username1+" password="+password);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
