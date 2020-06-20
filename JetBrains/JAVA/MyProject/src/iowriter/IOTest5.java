package iowriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest5 {
    public static void main(String[] args) {
        File f = new File("a.txt");
        Writer w = null;
        try {
            w = new FileWriter(f);
            //定义一个数组
            char[] c = {'a','b','c','b','c','b','c'};
//            w.write(c);

            //把数组的一部分写入文件
//            w.write(c,2,3);

//            w.write(97);

            w.write("HelloWord",0,2);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (w != null){
                try {
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
