package bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        //创建字符输入流对象
        InputStream in = null;
        try {
            in = new FileInputStream("a.txt");
            int r = in.read();
            System.out.println((char) r);
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
