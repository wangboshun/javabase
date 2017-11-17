package QueueTest.DelayQueueTest;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class Student implements Runnable, Delayed {

    public String name;
    public long submit;
    public long work;

    public Student(String name, long submit) {
        super();
        this.name = name;
        this.work = submit;
        this.submit = TimeUnit.NANOSECONDS.convert(submit, TimeUnit.NANOSECONDS) + System.nanoTime();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        System.out.println("-----getDelay-----");
        return unit.convert(submit - System.nanoTime(), unit.NANOSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        System.out.println("-----compareTo-----");
        Student s = (Student) o;
        if (submit > s.submit)
            return 1;
        else {
            if (submit < s.submit)
                return -1;
            else
                return 0;
        }
    }

    @Override
    public void run() {
        System.out.println("-----Student run-----");
        System.out.println(name + "用时：" + work / 100 + "分钟");
    }

    public static class Exam extends Student {
        public ExecutorService exe;

        public Exam(int submitTime, ExecutorService exec) {
            super(null, submitTime);
            this.exe = exec;
        }

        @Override
        public void run() {
            System.out.println("-----Exam run-----");
            exe.shutdownNow();
        }
    }

}
