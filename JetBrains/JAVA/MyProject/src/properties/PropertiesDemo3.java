package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo3 {
    public static void main(String[] args) {

        Properties ppt = new Properties();
        FileReader fr = null;
        try {
            fr = new FileReader("a.txt");
            //从字节流中加载数据到属性对象中
            ppt.load(fr);
            System.out.println(ppt);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
