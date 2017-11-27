package io.zifu;

import java.io.*;

public class bufferreader_1 {

    //链接流  多个文件复制
    public static void test() {

        String[] files = new String[]{"X:/Users/WBS/Desktop/test1.txt", "X:/Users/WBS/Desktop/test2.txt"};
        String str;
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("X:/Users/WBS/Desktop/test3.txt"));
            for (String item : files) {
                BufferedReader reader = new BufferedReader(new FileReader(item));
                while ((str = reader.readLine()) != null) {
                    writer.write(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
