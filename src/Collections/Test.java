package Collections;

import java.util.*;

public class Test {


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


    static class user {
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
}
