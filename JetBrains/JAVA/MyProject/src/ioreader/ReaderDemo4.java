package ioreader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class ReaderDemo4 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        Reader r = null;
        try {
            //创建出入流对象FileReader
            r = new FileReader(f);
            //定义一个字符数组
            char[] cs = new char[5];
            int content = r.read(cs, 2, 3);
            System.out.println(Arrays.toString(cs));


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
