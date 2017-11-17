package ThreadTest.base;

public class MyThread1 implements Runnable {

    private int count;

    public MyThread1() {
        count = 1;
    }

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
            }
        }
    }
}
