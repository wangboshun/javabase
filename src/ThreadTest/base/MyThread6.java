package ThreadTest.base;

public class MyThread6 implements Runnable {

    private static int count;

    public MyThread6() {
        count = 1;
    }

    public synchronized void run() {
        Test();
    }

    public static void Test() {
        synchronized (MyThread6.class) {
            for (int i = 0; i < 3; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
            }
        }
    }
}
