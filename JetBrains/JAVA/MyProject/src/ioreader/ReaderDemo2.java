package ioreader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReaderDemo2 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        Reader r = null;
        try {
            //创建出入流对象FileReader
            r = new FileReader(f);
            //定义一个数组
            char[] cs = new char[10];
            //向字符数组中添数据
            int len = r.read(cs);
            System.out.println("读取是长度："+len+"\t读取的内容："+ Arrays.toString(cs));

            len = r.read(cs);
            System.out.println("第二次读取是长度："+len+"\t读取的内容："+ Arrays.toString(cs));



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if (r != null){
                try {
                    r.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
