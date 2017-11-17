package ThreadTest.wait;

public class MyThread2 implements Runnable {

    public synchronized void run() {
        int number = 5;
        while (number > 0) {
            synchronized (Test.obj) {
                System.out.println("MyThread2");
                number--;
                Test.obj.notify();//主动释放对象
                try {
                    Test.obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
