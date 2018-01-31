package org.thread.chapter2;

/**
 * Created by 13 on 2017/5/4.
 * <p>
 * 线程中断测试！
 */
public class InterruptAndStopThread {
    public static void main(String args[]) throws InterruptedException {


        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {  //判断是否有中断信号，如果有中断则退出线程！
                        System.out.println( "收到中断信号,停止该线程!" );
                        break;
                    }
                    try {
                        Thread.sleep( 600 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        Thread.currentThread().interrupt();
                    }
                    System.out.println( "Running!" );
                    Thread.yield();
                }
            }
        };

        thread.start();
        Thread.sleep( 2000 );
        thread.interrupt();//进行中断操作
    }
}
