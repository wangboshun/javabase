package ThreadTest.lock;

//        ReentrantLock 与synchronized有相同的并发性和内存语义，还包含了中断锁等候和定时锁等候，
//        意味着线程MyThread1如果先获得了对象obj的锁，那么线程MyThread2可以在等待指定时间内依然无法获取锁，那么就会自动放弃该锁。
//        但是由于synchronized是在JVM层面实现的，因此系统可以监控锁的释放与否，而ReentrantLock使用代码实现的，系统无法自动释放锁，需要在代码中finally子句中显式释放锁lock.unlock();
//        注意：不是都获得了锁

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void Main() {
        Lock lock = new ReentrantLock();

        ThreadTest.lock.MyThread1 a = new ThreadTest.lock.MyThread1(lock);
        ThreadTest.lock.MyThread2 b = new ThreadTest.lock.MyThread2(lock);

        Map map1=Thread.getAllStackTraces();

        new Thread(a).start();

        Map map2=Thread.getAllStackTraces();

        new Thread(b).start();

        Map map3=Thread.getAllStackTraces();
    }
}
