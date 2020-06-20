package serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        ObjectInput in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("a.txt"));
            //读取的一个对象，叫反序列化
            Object o = in.readObject();
            List<Person> l = (List<Person>) o;
            System.out.println(l);
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
