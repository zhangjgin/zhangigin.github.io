package jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        //创建一个list集合
        List list = new ArrayList();
        //向末尾添加元素
        list.add("庄达菲");//1
        list.add("韩非");//2
        System.out.println(list);
        //在1处索引插入一个元素
        list.add(1,"刺猬女孩");
        System.out.println(list);

//        Object o = list.get(0);
        String o = (String) list.get(0);
        System.out.println(o);

        int size = list.size();
        System.out.println(size);

        ListIterator listItera= list.listIterator();

        while (listItera.hasNext()){
            String str = (String) listItera.next();
            if("庄达菲".equals(str)){
                //不能在一边遍历的时候一边操作集合，这样有线程并发的问题
                //list.add("夏蕊宁");
                //迭代器给我们提供了一个add方法，让我们避免了线程并发的问题，但是本次集合不生效
                listItera.add("夏蕊宁");

            }
            System.out.println(str);

        }
        System.out.println("-------庄达菲分割线--------------");

        while (listItera.hasPrevious()){
            String str = (String) listItera.previous();

            System.out.println(str);

        }
        System.out.println(list);
        System.out.println("--------------------------夏蕊宁分割线------------------------------------------------");

        /*//for循环list
        for (int i = 0; i < size; i++) {
            Object o1 = list.get(i);
            if ("刺猬女孩".equals(o1)){
                list.add("夏蕊宁"); //size的长度是固定的，添加的元素无法被遍历
            }
            System.out.println(o1);

        }*/
        //for循环list，把size换成list.size,变成动态的
        for (int i = 0; i < list.size(); i++) {
            Object o1 = list.get(i);
            if ("刺猬女孩".equals(o1)){
                list.add("双鱼座");
            }
            System.out.println(o1);

        }
        list.add("庄达菲");
        int i = list.indexOf("庄达菲");//获得某一个元素在集合中第一次出现是索引
        System.out.println(i);
        int i1 = list.lastIndexOf("庄达菲");//获得某一个元素在集合中最后一次出现的索引
        System.out.println(i1);
        System.out.println(list);


        list.add("吴景昊");
        //根据索引号来删除元素，返回删除的的那个元素，该元素后面的所有元素都会向前移动一步
        System.out.println(list);
        Object re = list.remove(6);
        System.out.println(re);
        System.out.println(list);
        list.remove("庄达菲");
        System.out.println(list);

        List list1 = new ArrayList();
        list1.add("韩非");
        list1.add("夏蕊宁");
        list1.add("双鱼座");
        list1.add("刺猬女孩");
        list.removeAll(list1);
        System.out.println(list);

    }
}
