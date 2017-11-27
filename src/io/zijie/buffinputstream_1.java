package io.zijie;

import java.io.*;

public class buffinputstream_1 {

    public static void test() {
        String filename = "X:/Users/WBS/Desktop/test.txt";

        byte[] buf = new byte[3];
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;

        try {
            inputStream = new BufferedInputStream(new FileInputStream(filename));
            outputStream = new BufferedOutputStream(new FileOutputStream(filename + "123"));
            while (inputStream.read(buf) != -1) {
                outputStream.write(buf);
            }
            outputStream.flush();//强制刷新缓冲区
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
