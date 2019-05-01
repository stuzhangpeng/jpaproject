package com.itcast.zhangpeng;

public class Zi extends Fu{
    static int a = sayHello();

    static {
        System.out.println("ccc");

    }

    public static int sayHello() {
        System.out.println("ddd");
        return  1;
    }

}
