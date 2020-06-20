package jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterationDemo {
    public static void main(String[] args) {
        //创建一个集合collection
        Collection coll1 = new ArrayList();
        coll1.add("劳斯莱斯");
        coll1.add("宾利");
        coll1.add("迈巴赫");
        coll1.add("宝马");
        coll1.add("玛莎蒂亚");
        coll1.add("大众");
        int size = coll1.size();
        System.out.println(size);
        iteracollection(coll1);

    }
    public static void iteracollection(Collection coll1){
        //获得一个集合的迭代器对象，迭代器的对象的指针时一去不复返的，只能遍历一次
        Iterator iterator = coll1.iterator();
        //我们通过迭代器的对象来遍历集合
        while(iterator.hasNext()){
            //获得这个元素
//            Object obj = iterator.next();
            String obj = (String) iterator.next();

            /*if("宾利".equals(obj)){ //迭代器在操作是不能添加元素的
                coll1.add("奥拓");
            }*/
            System.out.println(obj);
        }
    }
}
