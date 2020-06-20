package serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        Person p = new Person("zhangjing",19,new Date());
        Person p1 = new Person("zhuangdafei",19,new Date());
        Person p2 = new Person("fanfei",19,new Date());
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("a.txt"));
            out.writeObject(p);
            out.writeObject(p1);
            out.writeObject(p2);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
