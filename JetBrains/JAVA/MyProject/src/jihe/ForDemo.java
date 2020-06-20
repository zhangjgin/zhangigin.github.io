package jihe;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        //定义一个数组
        String[] strs = {"庄达菲","韩非"};
        for (String s:strs){
            System.out.println(s);
        }
        System.out.println("-------------------------------");
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        for (Integer i:l1){
            System.out.println(i);
        }
        System.out.println("-------------------------------");
        //这个增强的for循环不能支持并发
        /*List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        for (Integer i:l2){
            if(i.equals(2)){
                l2.add(10);
            }
            System.out.println(i);
        }*/
        System.out.println("-------------------------------");
        for (int i = 0; i < l1.size(); i++) {
            //根据索引获得集合的元素
            Integer val = l1.get(i);
            //如果某个元素是2就在这个集合里加入一个10
            if (val.equals(2)){
                l1.add(10);
            }
            System.out.println(val);
        }

    }
}
