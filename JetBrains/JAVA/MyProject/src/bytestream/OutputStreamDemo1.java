package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo1 {
    public static void main(String[] args) {
        //创建字节输出流
        OutputStream out = null;
        try {
            //创建一个字节数组
            byte[] bs = {97,98,99,100};
//            out = new FileOutputStream(new File("a.txt"));
            out = new FileOutputStream("a.txt",true);
//            out.write(bs);
            out.write(bs,0,2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
