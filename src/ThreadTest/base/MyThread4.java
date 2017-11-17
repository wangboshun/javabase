package ThreadTest.base;

public class MyThread4 implements Runnable {

    private userinfo u;

    public MyThread4(userinfo u) {
        this.u = u;
    }

    public void run() {
        synchronized (u) {
            u.sub(500);
            u.add(500);
            System.out.println(Thread.currentThread().getName() + "," + u.getName() + "," + u.getNumber());
        }
    }
}
