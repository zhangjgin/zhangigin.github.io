package conver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConverterDemo {
    public static void main(String[] args) {
        //创建字符流转换字节流的桥梁的对象
        OutputStreamWriter ow = null;
        try {
            ow = new OutputStreamWriter(new FileOutputStream("a.txt"));
            //字符流通向字节流的桥梁可以指定存储是编码
//            ow = new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
            ow.write("中国");
            ow.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ow != null){
                try {
                    ow.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
