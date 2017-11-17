package QueueTest.DelayQueueTest;

import java.util.Random;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    static int size = 3;

    public static void run() throws InterruptedException {
        Random r = new Random();
        DelayQueue<Student> s = new DelayQueue<>();
        ExecutorService exe = Executors.newCachedThreadPool();
        for (int i = 0; i < size; i++)
            s.put(new Student("学生" + (i + 1), 3000 + r.nextInt(9000)));
        s.put(new Student.Exam(12000, exe));
        exe.execute(new Teacher(s, exe));
    }

}
