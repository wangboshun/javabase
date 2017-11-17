import QueueTest.DelayQueueTest.base.Test3;
import QueueTest.DelayQueueTest.base.Test2;

import java.util.*;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        ArrarListTest();
//        LinkedListTest();
//        HashMapTest();
//        HashTableTest();
//        HashSetTest();
//        TreeSetTest();
//        LinkedHashSetTest();
//        HashCodeTest();
//        AbsTest();
        ThreadTest();
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

        DelayQueue<QueueTest.DelayQueueTest.base.Test1> s = new DelayQueue<>();
        ExecutorService exe = Executors.newCachedThreadPool();

        s.put(new QueueTest.DelayQueueTest.base.Test1("a", 1));
        s.put(new QueueTest.DelayQueueTest.base.Test1("b", 2));
        s.put(new QueueTest.DelayQueueTest.base.Test1("c", 3));

        s.put(new QueueTest.DelayQueueTest.base.Test3(exe));

        exe.execute(new QueueTest.DelayQueueTest.base.Test2(s, exe));
    }

    public static void AbsTest() {
        absimpl a = new absimpl();
        a.Test1();
        a.Test2();
    }

    public static void ArrarListTest() {//不排序
        System.out.println("ArrarListTest");
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(100);
        for (int i = 0; i < 10; i++)
            a.add(i);
        System.out.println(a.get(1));

        System.out.println("size:" + a.size());

        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext())
            System.out.println("" + iterator.next());
    }

    public static void LinkedListTest() {//不排序
        System.out.println("LinkedListTest");
        LinkedList<Integer> a = new LinkedList<Integer>();
        a.add(100);
        for (int i = 0; i < 10; i++)
            a.add(i);
        System.out.println(a.get(1));

        System.out.println("size:" + a.size());

        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext())
            System.out.println("" + iterator.next());
    }

    public static void HashMapTest() {//不排序
        System.out.println("HashMapTest");
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("a", 1111);
        a.put("a", null);//可以接受空
        a.put("b", 222);
        a.put("c", 4);

        System.out.println("size:" + a.size());

        for (Map.Entry<String, Integer> entry : a.entrySet())
            System.out.println("" + entry.getKey() + "," + entry.getValue());
    }

    public static void HashTableTest() {//不排序
        System.out.println("HashTableTest");
        Hashtable<String, Integer> a = new Hashtable<String, Integer>();
        a.put("a", 1);
//        a.put("a", null);//不可以接受空
        a.put("b", 3);
        a.put("b", 3);
        a.put("c", 2);

        System.out.println("size:" + a.size());

        for (Map.Entry<String, Integer> entry : a.entrySet())
            System.out.println("" + entry.getKey() + "," + entry.getValue());
    }

    public static void HashSetTest() { //不排序
        System.out.println("HashSetTest");
        HashSet<String> a = new HashSet<>();
        a.add("a");
        a.add("a");
        a.add("b");
        a.add("g");
        a.add("e");
        a.add("f");
        a.add("z");
        a.add(new String("111"));
        a.add(new String("111"));
        a.add(null);//可以为空

        System.out.println("size:" + a.size());

//        Iterator<Integer> iterator = a.iterator();
//        while (iterator.hasNext())
//            System.out.println("" + iterator.next());

        for (String number : a)
            System.out.println("" + number);
    }


    public static void TreeSetTest() {//排序
        System.out.println("TreeSetTest");
        TreeSet<Integer> a = new TreeSet<>();
        a.add(122222);
        a.add(1);
        a.add(2);
        a.add(3);
//        a.add(null);//不可以为空

        System.out.println("size:" + a.size());

//        Iterator<Integer> iterator = a.iterator();
//        while (iterator.hasNext())
//            System.out.println("" + iterator.next());

        for (Integer number : a)
            System.out.println("" + number);
    }

    public static void LinkedHashSetTest() {//不排序
        System.out.println("TreeSetTest");
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        a.add(122222);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(null);//可以为空

        System.out.println("size:" + a.size());

//        Iterator<Integer> iterator = a.iterator();
//        while (iterator.hasNext())
//            System.out.println("" + iterator.next());

        for (Integer number : a)
            System.out.println("" + number);
    }

    //通过 hashcode  equals方法 去重
    public static void HashCodeTest() {

        System.out.println("HashCodeTest");

        HashSet hs = new HashSet();
        hs.add(new user(1, "zhangsan"));
        hs.add(new user(2, "lisi"));
        hs.add(new user(3, "wangwu"));
        hs.add(new user(1, "zhangsan"));

        Iterator<user> it = hs.iterator();
        while (it.hasNext())
            System.out.println(it.next().tostring());
    }


}

class user {
    int id;
    String name;

    public user(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    通过 hashcode  equals方法 去重  注意大小写
    public int hashCode() {
        System.out.println("hashCode");
        return id * name.hashCode();
    }

    public boolean equals(Object o) {
        System.out.println("equals");
        user u = (user) o;
        return id == u.id && name.equals(u.name);
    }

    public String tostring() {
        return id + "," + name;
    }
}
