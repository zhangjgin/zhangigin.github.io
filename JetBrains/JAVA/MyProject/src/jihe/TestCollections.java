package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    public static void main(String[] args) {
        List<Student1> l1 = new ArrayList<>();
        l1.add(new Student1("庄达菲",20));
        l1.add(new Student1("韩菲",19));
        l1.add(new Student1("小贝",19));
        l1.add(new Student1("白振宇",26));
        System.out.println(l1);
        //集合反转
        System.out.println("---------------------集合反转---------------------");
        Collections.reverse(l1);
        System.out.println(l1);
        //打乱集合
        System.out.println("---------------------打乱集合--------------------");
        Collections.shuffle(l1);
        System.out.println(l1);
        //排序
        System.out.println("----------------------排序-----------------------");
        Collections.sort(l1);
        System.out.println(l1);

        //通过外部的比较器来排序
        System.out.println("----------------------通过外部的比较器来排序-----------------------");
        Collections.sort(l1,new StudentCompartor());
        System.out.println(l1);

        //Collection集合里面只有Vector是线程安全的
        Collections.synchronizedList(l1);//变成线程同步（线程安全）
    }
}
