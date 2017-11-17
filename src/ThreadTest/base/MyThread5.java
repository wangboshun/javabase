package ThreadTest.base;

public class MyThread5 implements Runnable {

    private static int count;

    public MyThread5() {
        count = 1;
    }

    public synchronized void run() {
        Test();
    }

    public synchronized static void Test() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + (count++));
        }
    }
}
