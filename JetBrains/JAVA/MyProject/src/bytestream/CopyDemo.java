package bytestream;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        InputStream in =null;
        OutputStream out = null;

        try {
            //创建字节输入流
            in = new FileInputStream("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\庄达菲.jpg");
            //创建字节输出流
            out = new FileOutputStream("庄达菲.jpg");
            //定义一个字节数组，输入流读取写入数组，输出流读取数组中的内容写入字节输出流对象
            byte[] bs = new byte[1314];
            int line = -1;
            while ((line=in.read(bs)) != -1){
                //把读取的数据写入字节流输出流
                out.write(bs,0,line);
                out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
