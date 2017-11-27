package io.zifu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class fileread_1 {

    public static void test() {
        String filename = "X:/Users/WBS/Desktop/test.txt";

        char[] buf = new char[3];
        int len = 0;
        FileReader fileReader = null;
        PrintWriter printWriter = null;

        try {
            fileReader = new FileReader(filename);
//            printWriter=new PrintWriter(System.out);打印到控制台
            printWriter = new PrintWriter(filename + "123");
            while ((len = fileReader.read(buf)) != -1) {
                printWriter.write(buf, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
