package bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamDemo3 {
    public static void main(String[] args) {
        //创建字符输入流对象
        InputStream in = null;
        try {
            byte[] bs = new byte[6];
            in = new FileInputStream("a.txt");
            int len = in.read(bs,1,2);
            System.out.println("读取了字节数："+len+"\t读取到的内容："+ Arrays.toString(bs));


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
