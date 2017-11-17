package ThreadTest.wait;

//        使用static obj作为锁的对象，当线程MyThread1启动时（假如MyThread1首先获得锁，则MyThread2会等待），打印“MyThread1”后，会先主动释放锁，然后阻塞自己。
//        MyThread2获得对象锁，打印“MyThread2”，然后释放锁，阻塞自己，那么MyThread1又会获得锁，然后...一直循环下去，直到count = 0.
//        这样，使用Synchronized和wait()以及notify()就可以达到线程同步的目的。
//        注意：两个都获得了锁

import java.util.Map;

public class Test {
    public static final Object obj = new Object();

    public static void Main() {
        Map map1=Thread.getAllStackTraces();
        new Thread(new MyThread1()).start();
        Map map2=Thread.getAllStackTraces();
        new Thread(new MyThread2()).start();
        Map map3=Thread.getAllStackTraces();
    }
}
