package QueueTest.DelayQueueTest;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;

public class Teacher implements Runnable {

    private DelayQueue<Student> s;
    private ExecutorService exe;

    public Teacher(DelayQueue<Student> s, ExecutorService exe) {
        super();
        this.exe = exe;
        this.s = s;
    }

    @Override
    public void run() {
        try {
            System.out.println("考试开始……");
            while (!Thread.interrupted()) {
                s.take().run();  //获取并删除队列头部的元素，如果队列为空，则返回null。
            }
            System.out.println("考试结束……");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
