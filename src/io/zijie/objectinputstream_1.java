package io.zijie;

import java.io.*;

public class objectinputstream_1 {

    //把对象写到文件  类必须继承Serializable
    public static void TestObject() {

        ObjectInputStream input = null;
        ObjectOutputStream out = null;

        String filename = "X:\\Users\\WBS\\Desktop\\test.txt";

        try {
            out = new ObjectOutputStream(new FileOutputStream(filename));
            out.writeObject("aaaaaaaaaaaaaaaaaaaaaaaaa");
            out.writeObject(new test(2, "wqy"));
            out.writeObject(new test(3, "wc"));

            input = new ObjectInputStream(new FileInputStream(filename));
            for (int i = 0; i < 3; i++) {
                System.out.println(input.readObject());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static class test implements Serializable {
        public int id;
        public String name;

        public test(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "test [id=" + id + ", name=" + name + "]";
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
    }
}
