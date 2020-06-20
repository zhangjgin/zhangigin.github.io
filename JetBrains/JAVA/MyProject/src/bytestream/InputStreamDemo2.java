package bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo2 {
    public static void main(String[] args) {
        //创建字符输入流对象
        InputStream in = null;
        try {
            byte[] bs = new byte[6];
            in = new FileInputStream("a.txt");
            int len = -1;
            while ((len = in.read(bs)) != -1){
                String s = new String(bs,0,len);
                System.out.print(s);
            }
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
