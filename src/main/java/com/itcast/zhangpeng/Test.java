package com.itcast.zhangpeng;

public class Test {
    public static void main(String[] args) {
       for (int i=0;i<=5;i++){
           new Thread(() ->{
               System.out.println(Thread.currentThread().getName());;
               Singleton.getInstance();
           },String.valueOf(i)).start();
       }
    }
}
