package properties;

import java.io.PrintWriter;
import java.util.Properties;

public class PropertiesDemo4 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties ppt = new Properties();
        //存储键值对
        ppt.setProperty("180236","庄达菲");
        ppt.setProperty("180237","吴景昊");

        PrintWriter pw = null;
        try {
            pw = new PrintWriter("a.txt");
            //把ppt数据输出到流中
            ppt.store(pw,"what is your name?");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (pw != null){
                pw.close();
            }
        }


    }
}
