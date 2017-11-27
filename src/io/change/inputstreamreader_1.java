package io.change;

import java.io.*;

//编码：字符串à字节数组
//解码：字节数组à字符串

public class inputstreamreader_1 {
    public static void test() {

        String filename = "X:/Users/WBS/Desktop/test.txt";

        try {
            FileInputStream inputStream = new FileInputStream(filename);

            FileOutputStream outputStream = new FileOutputStream(filename + "123");

            InputStreamReader streamReader = new InputStreamReader(inputStream, "GB2312");//中文
            OutputStreamWriter streamWriter = new OutputStreamWriter(outputStream, "GB2312");//中文

            BufferedReader bufferedReader = new BufferedReader(streamReader);
            BufferedWriter bufferedWriter = new BufferedWriter(streamWriter);

            String str;

            while ((str = bufferedReader.readLine()) != null) {
                bufferedWriter.write(str);
                bufferedWriter.flush();
            }

            bufferedReader.close();
            bufferedWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
