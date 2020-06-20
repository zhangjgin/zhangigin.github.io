package ioreader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo3 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        Reader r = null;
        try {
            //创建出入流对象FileReader
            r = new FileReader(f);
            //定义一个字符数组
            char[] cs = new char[10];
            int len = -1;
            while ((len = r.read(cs)) != -1){
                //把字符数组变成字符串
                String str = new String(cs,0,len);
                System.out.print(str);
            }



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
