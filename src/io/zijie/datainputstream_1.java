package io.zijie;

import java.io.*;

public class datainputstream_1 {

    public static void TestObject() {
        String filename = "X:\\Users\\WBS\\Desktop\\test.txt";
        test[] array = {new test(1, "wbs"), new test(2, "wqy"), new test(3, "wc")};

        DataInputStream input = null;
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(filename));

            for (test t : array) {
                out.write(t.getId());
                out.writeUTF(t.getName());
            }
            out.flush();
            out.close();

            input = new DataInputStream(new FileInputStream(filename));
            for (int i = 0; i < 3; i++) {
                String name = input.readUTF();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class test {

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
