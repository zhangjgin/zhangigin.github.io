package jihe;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("庄达菲");
        v.addElement("韩非");
        System.out.println(v);
        Object o = v.get(1);
        Object o1 = v.elementAt(0);
        System.out.println(o);
        System.out.println(o1);
        System.out.println("----------------------------------------");

        for (int i = 0; i < v.size(); i++) {
            Object o2 = v.get(i);
            System.out.println(o2);
        }
        System.out.println("---------------------------------------");
        Enumeration el = v.elements();
        while (el.hasMoreElements()){
            Object o2 = el.nextElement();
            System.out.println(o2);
        }
    }
}
