package bytestream;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) {
        //定义一个高效缓冲字节流
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            in = new BufferedInputStream(new FileInputStream("E:\\Apply_E\\OneDrive - Office 365\\Desktop\\庄达菲.jpg"));
            out = new BufferedOutputStream(new FileOutputStream("夏蕊宁.jpg"));
            byte[] bs = new byte[1314];
            int line = -1;
            while ((line = in.read(bs)) != -1){
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
