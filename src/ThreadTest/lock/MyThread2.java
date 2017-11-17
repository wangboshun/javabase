package ThreadTest.lock;

import java.util.concurrent.locks.Lock;

public class MyThread2 implements Runnable {

    private Lock lock;

    public MyThread2(Lock lock) {
        this.lock = lock;
    }

    public void run() {
        int number = 5;
        while (number > 0) {
            try {
                lock.lock();
                System.out.println("MyThread2");
                number--;
            } finally {
                lock.unlock();
            }
        }
    }
}
