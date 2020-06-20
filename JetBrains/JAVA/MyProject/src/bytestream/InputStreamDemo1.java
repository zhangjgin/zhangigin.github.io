package bytestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo1 {
    public static void main(String[] args) {
        //创建字符输入流对象
        InputStream in = null;
        try {
            byte[] bs = new byte[6];
            in = new FileInputStream("a.txt");
            int len = in.read(bs);
            System.out.println("读取了字节数："+len+"\t读取到的内容："+ new String(bs,0,len));

            len = in.read(bs);
            System.out.println("读取了字节数："+len+"\t读取到的内容："+ new String(bs,0,len));

            len = in.read(bs);
            System.out.println("读取了字节数："+len);

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
