package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) {

        Properties ppt = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream("a.txt");
            //从字节流中加载数据到属性对象中
            ppt.load(in);
            System.out.println(ppt);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
