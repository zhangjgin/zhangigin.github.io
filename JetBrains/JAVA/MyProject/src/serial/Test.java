package serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Person p = new Person("庄达菲",19,new Date());
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("a.txt"));
            out.writeObject(p);
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
