package jihe;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GenericityDemo {
    public static void main(String[] args) {
        List<String> a1 = new ArrayList<>();
        a1.add("庄达菲");
        a1.add("韩非");
//        System.out.println(a1);
        System.out.println("-------------------------------");
        List<Integer> a2 = new ArrayList<>();
        a2.add(5);
        a2.add(2);
        a2.add(0);
//        System.out.println(a2);

        Iterator<Integer> ite = a2.iterator();
        while (ite.hasNext()){
            Integer n = ite.next();
//            System.out.println(n);
        }

        List<Student> a3 = new ArrayList<>();
        Student s = new Student(180236,"庄达菲",19);
        Student s1 = new Student(180237,"吴景昊",25);
        a3.add(s);
        a3.add(s1);
//        System.out.println(a3);

        /*List<Student> a4 = new ArrayList<>();
        Student s3 = new Student(180238,"小贝",20);
        Student s4 = new Student(180239,"马俊涛",21);
        a4.add(s3);
        a4.add(s4);*/
        List<Children> a4 = new ArrayList<>();
        Children s3 = new Children(180238,"小贝",20,"女");
        Children s4 = new Children(180239,"马俊涛",21,"男");
        a4.add(s3);
        a4.add(s4);
        a3.addAll(a4);
//        System.out.println(a3);

        CustomGenericity<String> str = new CustomGenericity<>();
        str.setT("庄达菲");
        //获得对应泛型结果
        String t = str.getT();

        //指定泛型是integer类型
        CustomGenericity<Integer> str1 = new CustomGenericity<>();
        str1.setT(1);
        Integer t1 = str1.getT();

        //指定泛型是integer类型的数组
        CustomGenericity<Integer[]> str2 = new CustomGenericity<>();
        str2.setT(new Integer[]{12,1314,15});
        Integer[] t2 = str2.getT();

        //测试两个泛型
        CustomGenericity1<String,Integer> str3 = new CustomGenericity1<>("庄达菲",19);
        CustomGenericity1<String, Date> str4 = new CustomGenericity1<>("庄达菲",new Date());



    }

}
