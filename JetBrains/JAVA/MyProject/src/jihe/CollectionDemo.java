package jihe;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionDemo {
    public static void main(String[] args) {
//        //创建一个集合collection
//        Collection coll1 = new ArrayList();
//        coll1.add("劳斯莱斯");
//        coll1.add("宾利");
//        coll1.add("迈巴赫");
////        System.out.println(coll1);
//        //创建另一个集合
//        Collection coll2 = new ArrayList();
//        coll2.add("宝马");
//        coll2.add("玛莎蒂亚");
//        coll2.add("大众");
////        System.out.println(coll2);
//        //把一个集合的内容加入到另一个集合中
//        coll1.addAll(coll2);
////        System.out.println(coll1);
//        //清空集合
////        coll1.clear();
////        System.out.println(coll1);
//        //从集合中删除某个元素
//        coll1.remove("劳斯莱斯");
//        System.out.println(coll1);
//        coll1.removeAll(coll2);
////        System.out.println(coll1);
//
//        //判断集合中是否包含某个元素
//        boolean b = coll1.contains("宾利");
//        System.out.println(b);
//        boolean b1 = coll1.containsAll(coll2);
////        System.out.println(b1);
//
//        //判断一个集合是否为空
//        boolean b2 = coll1.isEmpty();
////        System.out.println(b2);
//        //把集合转换成数组
//        Object[] objects = coll1.toArray();
//        for (int i = 0;i < objects.length;i++){
//            System.out.println(objects[i]);
//        }
//        Collection c = new ArrayList();
//        c.add(1);
//        c.add(new Date());
//        Student s = new Student(1,"张靖",20);
//        c.add(s);
////        System.out.println(c);
//
//        Collection c1 = new ArrayList();
//        c1.add("宝马");
//        c1.add("奔驰");
//        c.add(c1);//集合中添加一个集合
////        System.out.println(c);

        Collection c2 = new ArrayList();
        Student s3 = new Student(3,"吴凡",20);
        //获得这个学生的集合
        Collection books = s3.getBooks();
        books.add(new book("斗罗大陆",128));
        books.add(new book("江山如此多娇",2));
        Student s4 = new Student(4,"庄达菲",18);
        Collection books1 = s4.getBooks();
        books1.add(new book("中国上下五千年",512));
        c2.add(s3);
        c2.add(s4);
        System.out.println(c2);

    }
}
