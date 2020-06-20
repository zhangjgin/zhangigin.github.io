package ioreader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo1 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        Reader r = null;
        try {
            //创建出入流对象FileReader
            r = new FileReader(f);
            //读取数据，读取的数据被转换成了ASCII
            int c = -1;
            //单个字符的读取性能低
            while ((c = r.read()) != -1){
                System.out.print((char) c);
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
