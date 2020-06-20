package serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Test1 {
    public static void main(String[] args) {
        ObjectInput in = null;
        try {
            in = new ObjectInputStream(new FileInputStream("a.txt"));
            //读取的一个对象，叫反序列化
            Object o = in.readObject();
            Person p = (Person)o;
            System.out.println(p.getAge());
            System.out.println(p.getBirth());
            System.out.println(p.getName());
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
