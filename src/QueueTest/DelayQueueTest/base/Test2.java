package QueueTest.DelayQueueTest.base;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;

public class Test2 implements Runnable {
    public ExecutorService exe;
    public DelayQueue<Test1> s;

    public Test2(DelayQueue<Test1> s, ExecutorService exec) {
        this.s = s;
        this.exe = exec;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                s.take().run();  //获取并删除队列头部的元素，如果队列为空，则返回null。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
