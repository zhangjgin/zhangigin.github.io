package ioreader;

import java.io.*;

public class ReaderDemo {
    public static void main(String[] args) {
        File f = new File("a.txt");
        Reader r = null;
        try {
            //创建出入流对象FileReader
            r = new FileReader(f);
            //读取数据，读取的数据被转换成了ASCII
            int c = r.read();
            System.out.println((char) c);
            c = r.read();
            System.out.println(c);
            c = r.read();
            System.out.println(c);
            //如果读取到-1就说明后面没有字符了
            c = r.read();
            System.out.println(c);
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
