package ioreader;






import java.io.*;

public class CopyDemo1 {
    public static void main(String[] args) {
        File f = new File("src/ioreader/ReaderDemo.java");
        File f1 = new File("a.txt");
        Reader r = null;
        Writer w = null;
        try {
            r = new FileReader(f);
            w = new FileWriter(f1);
            char[] cs = new char[1314];
            int len = -1;
            while ((len = r.read(cs)) != -1){

                //把输入流读取到的数据写入字符输出流
                w.write(cs,0,len);
            }
            w.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (w != null){
                    w.close();
                }
                if (r != null){

                        r.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
