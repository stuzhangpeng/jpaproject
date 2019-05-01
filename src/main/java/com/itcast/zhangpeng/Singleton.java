package com.itcast.zhangpeng;
/**
 * 单例模式
 *
 */
public class Singleton {
    //加入volatile是禁止指令重排序，可能出现未初始化对象就去取singleton的情况导致取到空值
    //即为2 ，3 顺序出现了重排序

    private static volatile Singleton singleton;
    private Singleton(){
        System.out.println("构造方法被调用");
    }
    public static  Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if (singleton==null)
                singleton=new Singleton();
                //new 对象的正常过程
                //1allocate()申请内存空间
                //2初始化内存
                //3将实例变量指向内存空间
            }
        }
        return singleton;
    }
}
