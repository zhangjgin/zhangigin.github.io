package bytestream;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) {
        //创建字节输出流
        OutputStream out = null;
        try {
            out = new FileOutputStream(new File("a.txt"));
            //字节流不需要flush
            out.write(97);
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
