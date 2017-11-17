package ThreadTest.lock;

import java.util.concurrent.locks.Lock;

public class MyThread1 implements Runnable {

    private Lock lock;

    public MyThread1(Lock lock) {
        this.lock = lock;
    }

    public void run() {
        int number = 5;
        while (number > 0) {
            try {
                lock.lock();
                System.out.println("MyThread1");
                number--;
            } finally {
                lock.unlock();
            }
        }
    }
}
