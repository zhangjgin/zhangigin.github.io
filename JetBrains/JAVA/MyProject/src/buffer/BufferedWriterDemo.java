package buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        //创建高效缓冲字符输出流
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("a.txt"));
            //写一行数据
            bw.write("HelloWord");
            //换行
            bw.newLine();
            bw.write("HelloWord");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
