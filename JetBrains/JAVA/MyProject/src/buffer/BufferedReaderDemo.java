package buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        BufferedReader br = null;
        try {
            //创建一个高效缓冲字符输入流对象
            br = new BufferedReader(new FileReader("a.txt"));
            //读取一行，读取到一行的边界的是null
            String line = null;
            while ((line=br.readLine()) != null){
                System.out.println(line);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭外层的对象的时候，内层的资源会自动关闭
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
