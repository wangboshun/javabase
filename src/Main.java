
import io.change.inputstreamreader_1;
import io.zifu.bufferreader_1;
import io.zifu.fileread_1;
import io.zijie.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        IO();
    }

    public static void Collection() {
//        ArrarListTest();
//        LinkedListTest();
//        HashMapTest();
//        HashTableTest();
//        HashSetTest();
//        TreeSetTest();
//        LinkedHashSetTest();
//        HashCodeTest();
//        AbsTest();
    }

    public static void ThreadTest() throws InterruptedException {

//        非静态：使用的是同一把锁
//        MyThread1 a1 = new MyThread1();
//        Thread t1 = new Thread(a1, "t1");
//        Thread t2 = new Thread(a1, "t2");
//        Thread t3 = new Thread(a1, "t3");
//        t1.start();
//        t2.start();
//        t3.start();

//        静态：run中调用了静态方法method，而静态方法是属于类的，所以syncThread1和syncThread2相当于用了同一把锁
//        MyThread5 a1 = new MyThread5();
//        MyThread5 a2 = new MyThread5();
//        MyThread5 a3 = new MyThread5();
//        Thread t1 = new Thread(a1, "t1");
//        Thread t2 = new Thread(a2, "t2");
//        Thread t3 = new Thread(a3, "t3");
//        t1.start();
//        t2.start();
//        t3.start();

//        类加锁：synchronized作用于一个类时，是给这个类加锁，类所有对象用的是同一把锁
//        MyThread6 a1 = new MyThread6();
//        MyThread6 a2 = new MyThread6();
//        MyThread6 a3 = new MyThread6();
//        Thread t1 = new Thread(a1, "t1");
//        Thread t2 = new Thread(a2, "t2");
//        Thread t3 = new Thread(a3, "t3");
//        t1.start();
//        t2.start();
//        t3.start();

//        MyThread2 a1 = new MyThread2();
//        MyThread2 a2 = new MyThread2();
//        MyThread2 a3 = new MyThread2();
//        a1.start();
//        a2.start();
//        a3.start();

//        MyThread3 a1 = new MyThread3();
//        Thread t1 = new Thread(a1, "t1");
//        Thread t2 = new Thread(a1, "t2");
//        Thread t3 = new Thread(a1, "t3");
//        t1.start();
//        t2.start();
//        t3.start();

//        userinfo u = new userinfo(100, "haha");
//        MyThread4 a1 = new MyThread4(u);
//        Thread t1 = new Thread(a1, "t1");
//        Thread t2 = new Thread(a1, "t2");
//        Thread t3 = new Thread(a1, "t3");
//        t1.start();
//        t2.start();
//        t3.start();

//        lock synchonized的区别
//        ThreadTest.wait.Test.Main();

//        School school = new School();
//        School.Teacher teacher  = school.new Teacher("老师");
//        School.Student zhangsan = school.new Student("张三");
//        School.Student lisi     = school.new Student("李四");
//        School.Student wangwu   = school.new Student("王五");
//        teacher.start();
//        zhangsan.start();
//        lisi.start();
//        wangwu.start();

//        QueueTest.DelayQueueTest.Test.run();

//        DelayQueue<QueueTest.DelayQueueTest.base.Test1> s = new DelayQueue<>();
//        ExecutorService exe = Executors.newCachedThreadPool();
//
//        s.put(new QueueTest.DelayQueueTest.base.Test1("a", 1));
//        s.put(new QueueTest.DelayQueueTest.base.Test1("b", 2));
//        s.put(new QueueTest.DelayQueueTest.base.Test1("c", 3));
//
//        s.put(new QueueTest.DelayQueueTest.base.Test3(exe));
//
//        exe.execute(new QueueTest.DelayQueueTest.base.Test2(s, exe));


    }

    public static void AbsTest() {
        absimpl a = new absimpl();
        a.Test1();
        a.Test2();
    }

    public static void IO() {
//        inputstream_1.GetFileLenth();
//        buffinputstream_1.test();
//        fileinputstream_1.FileCopy();
//        objectinputstream_1.TestObject();
//        datainputstream_1.TestObject();
//        fileread_1.test();
//        bufferreader_1.test();
        inputstreamreader_1.test();
    }
}