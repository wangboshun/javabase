package io.zijie;

import java.io.*;

//字节流   所有字节输出流的父类
public class inputstream_1 {

    public static void GetFileLenth() {

//        String filename = "X:\\Users\\WBS\\Desktop\\计算机语言.pptx";
        String filename = "X:/Users/WBS/Desktop/计算机语言.pptx";

        int lenth = 0;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filename);
            while (inputStream.read() != -1) {
                lenth++;
            }
            System.out.println("文件的长度是：" + lenth);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();//因为FileInPutStream有缓冲区  所以必须得手动关闭
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
