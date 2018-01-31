package org.thread.chapter2;

/**
 * 线程Sleep中被Interrupt
 *
 * @author
 * @create 2018-01-31 15:35
 **/
public class InterruptSleepThread {

    public static void main(String[] args) throws InterruptedException {

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

                        System.out.println( "Interrupt In Sleep!" );
/*
                        注意： Thread． sleep()方法由于中断而抛出异常，此时，它会清除中断标记，如果不加处理，
                        那么在下一次循环开始时，就无法捕获这个中断，故在异常处理中，再次设置中断标记位，才能发现当前线程中断。
*/
                        Thread.currentThread().interrupt();//
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
