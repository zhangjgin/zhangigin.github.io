package buffer;

import java.io.*;

public class CopyTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            //创建高效缓冲输入流
            br = new BufferedReader(new FileReader("src/buffer/BufferedReaderDemo.java"));
            //创建高效缓冲输出流
            bw = new BufferedWriter(new FileWriter("a.txt"));
            //创建读取一行的变量
            String line = null;
            while ((line = br.readLine()) != null){
                //把读入的这一行数据写入到高效缓冲字符符输出流里面
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null){
                    br.close();
                }
                if (bw != null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
