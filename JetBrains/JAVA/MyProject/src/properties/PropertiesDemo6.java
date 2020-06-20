package properties;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo6 {
    public static void main(String[] args) {

        Properties ppt = new Properties();
        FileReader fr = null;
        InputStream in =null;
        try {
//            fr = new FileReader("src/name.properties");
             in = PropertiesDemo.class.getClassLoader().getResourceAsStream("name.properties");
            //从字节流中加载数据到属性对象中
            ppt.load(in);
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
