package Test;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Student> s = new TreeSet<>();//不允许null存在
        Student s1 = new Student("庄达菲",20);
        Student s2 = new Student("韩菲",19);
        s.add(s1);
        s.add(s2);
        System.out.println(s);
    }
}
