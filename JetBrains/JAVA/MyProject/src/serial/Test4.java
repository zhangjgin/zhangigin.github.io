package serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        Person p = new Person("zhangjing",19,new Date());
        Person p1 = new Person("zhuangdafei",19,new Date());
        Person p2 = new Person("fanfei",19,new Date());

        List<Person> l = new ArrayList<>();
        l.add(p);
        l.add(p1);
        l.add(p2);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("a.txt"));
            out.writeObject(l);
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
