package ThreadTest.base;

public class MyThread3 implements Runnable {

    private int count;

    public MyThread3() {
        count = 0;
    }

    //加了synchronized之后  每个线程运行5次之后启动其他线程
    //如果一个加synchronized  一个不加  随机访问
    //如果两个加synchronized  按照顺序来
    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            Test1();
        } else if (Thread.currentThread().getName().equals("t2")) {
            Test2();
        }
    }

    public synchronized void Test2() {
        for (int i = 0; i < 5; i++) {
            count++;
            System.out.println(Thread.currentThread().getName() + ":" + count);
        }
    }

    public void Test1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " count:" + count);
        }
    }
}
