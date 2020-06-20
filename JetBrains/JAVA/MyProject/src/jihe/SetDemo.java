package jihe;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        /*
        * set是无序
        * set的元素是不可重复的，如果重复了就会自动去掉
        * set只能有一个null
        * */
        Set s = new HashSet();
        s.add("庄达菲");
        s.add("庄达菲");
        s.add("庄达菲");
        s.add("韩非");
        s.add("小贝");
        s.add(null);
        s.add(null);
        s.add(null);
        System.out.println(s);

        Set<Student> s1 = new HashSet<>();
        s1.add(new Student(180236,"庄达菲",19));
        s1.add(new Student(180236,"庄达菲",19));
        s1.add(new Student(180237,"韩非",19));
        s1.add(new Student(180238,"小贝",19));
        System.out.println(s1);
    }
}
