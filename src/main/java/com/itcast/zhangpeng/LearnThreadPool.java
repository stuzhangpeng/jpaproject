package com.itcast.zhangpeng;

import java.util.concurrent.*;

/**
 *
 * 学习线程池的使用
 *
 *
 */
public class LearnThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //固定线程数的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();
        /*Future<?> submit = executorService.submit(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        });*/
        Runnable runnable=() -> {
            try {
                TimeUnit.MILLISECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+">>>"+1);
        };
       executorService.execute(runnable);
       executorService.execute(runnable);
       executorService.execute(runnable);
       executorService.execute(runnable);
       executorService.execute(runnable);
       executorService.shutdown();
    }

}
