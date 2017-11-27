package QueueTest.DelayQueueTest.base;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Test1 implements Runnable, Delayed {

    public long getDelay() {
        return delay;
    }

    public void setDelay(long delay) {
        this.delay = delay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean flag;

    @Override
    public void run() {
        System.out.println("run-------------:" + name);
    }

    private long delay;
    private String name;

    public Test1(String elementName, long delay) {
        super();
        this.name = elementName;
        this.delay = delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        System.out.println("getDelay");
        flag = true;
        return 0;
    }

    @Override
    public int compareTo(Delayed o) {
//        验证flag，在里面做判断
        System.out.println("compareTo");
        if (flag) {
            Test1 t = (Test1) o;
            if (t.getDelay() == 1) {
                System.out.println("compareTo 1");
                return 1;
            } else if (t.getDelay() == 2) {
                System.out.println("compareTo 2");
                return 0;
            } else if (t.getDelay() == 3) {
                System.out.println("compareTo 3");
                return 1;
            }
        }
        return 1;
    }
}
