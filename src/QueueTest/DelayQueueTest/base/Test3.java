package QueueTest.DelayQueueTest.base;

import java.util.concurrent.ExecutorService;

public class Test3 extends Test1 {

    public ExecutorService exe;

    public Test3(ExecutorService exec) {
        super("test3",1000);
        this.exe = exec;
    }

    @Override
    public void run() {
        System.out.println("-----End-----");
        exe.shutdownNow();
    }
}
