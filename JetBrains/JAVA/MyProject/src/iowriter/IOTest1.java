package iowriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOTest1 {
    public static void main(String[] args) {
        //创建一个文件对象
        File f = new File("a.txt");
        Writer w = null;
        try {
            //IO流是需要关闭，如果不这样设计就会不能关闭资源
            w = new FileWriter(f);
            w.write("HelloWord");
            w.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //判断writer对象不是空的，防止空指针异常
            /*if (w != null){
                try {
                    //在关闭之前会做flush的事情
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }*/
        }
    }
}
