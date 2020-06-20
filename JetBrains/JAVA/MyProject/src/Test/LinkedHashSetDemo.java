package Test;



import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> ls = new LinkedHashSet<>();//是有序的
        ls.add("庄达菲");
        ls.add("小贝");
        ls.add("白振宇");
        ls.add(null);
        System.out.println(ls);

        Student s1 = new Student("abc",19);
        Student s2 = new Student("abd",19);
        int i = s1.compareTo(s2);
        System.out.println(i);
    }
}
