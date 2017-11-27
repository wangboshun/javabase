package io.zijie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileinputstream_1 {

    //文件复制   利用BufferedInputStream作为缓冲
    public static void FileCopy() {
        String filename = "X:\\Users\\WBS\\Desktop\\test.txt";
        String addstr = "abc";
        byte[] buf = new byte[3];
        int len = 0;
        FileInputStream input = null;
        FileOutputStream out = null;
        try {
            input = new FileInputStream(filename);
            out = new FileOutputStream(filename + "123");//文件不存在会自动创建
            int a = 0;
            while ((len = input.read(buf)) != -1) {  //len  目的在于防止最后一次读取的字节小于buffer长度
                if (a == 0) {
                    a++;
                    out.write(buf, 0, len);
                    out.write(addstr.getBytes(), 0, 3);
                } else {
                    out.write(buf, 0, len);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
