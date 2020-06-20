package conver;



import java.io.*;

public class ConverterDemo1 {
    public static void main(String[] args) {
        //创建字符流转换字节流的桥梁的对象
        InputStreamReader ir = null;
        try {
            ir = new InputStreamReader(new FileInputStream("a.txt"));
            char[] cs = new char[1024];
            int len = ir.read(cs);
            System.out.println(new String(cs,0,len));

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ir != null){
                try {
                    ir.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
