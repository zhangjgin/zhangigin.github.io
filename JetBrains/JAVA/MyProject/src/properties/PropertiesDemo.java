package properties;

import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties ppt = new Properties();
        //存储键值对
        ppt.setProperty("180236","庄达菲");
        ppt.setProperty("180237","吴景昊");
        System.out.println(ppt);

        String name1 = ppt.getProperty("180236");
        String name2 = ppt.getProperty("180237");
        System.out.println(name1);
        System.out.println(name2);



    }
}
