package jihe;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //创建一个Map集合，Map是无序的
        Map<String,String> m1 = new HashMap<>();
        //向集合中加元素
        m1.put("何泽远","白振宇");
        m1.put("郑妙","小贝");
        m1.put("庄达菲","韩菲");
        //值是可以重复的
        m1.put("章若楠","韩菲");
        //如果存在重复的key，就会把之前的覆盖掉
//        m1.put("庄达菲","夏蕊宁");
        //键可以允许有一个null，值可以有多个为空的
        m1.put(null,"韩菲");
        System.out.println(m1);

        Map<String,String> m2 = new HashMap<>();
        m2.put("李逸男","吴景昊");
        m2.put("王锐","张凡");
        m2.put("余昊洋","吴怡怡");
        m1.putAll(m2);
        System.out.println(m1);

       /* //清空集合
        m1.clear();
        System.out.println(m1);*/

        //删除键
        m1.remove(null);
        System.out.println(m1);

        //根据key获得值
        String v1 = m1.get("庄达菲");
        System.out.println(v1);

        //获得一个Map的集合的key的set集合
        Set<String> s1 = m1.keySet();
        System.out.println(s1);

        //遍历Map集合
        for (String i:s1){
            String v2 = m1.get(i);
            System.out.println(i+"-----→"+v2);
        }

        //判断Map集合是否包含这个值和键
        boolean iscontain = m1.containsValue("韩菲");
        System.out.println(iscontain);
        boolean iscontain1 = m1.containsKey("李逸男");
        System.out.println(iscontain1);

        //判断Map集合是否为空
        boolean isempty = m1.isEmpty();
        System.out.println(isempty);

        Set<Map.Entry<String, String>> entries = m1.entrySet();
        for (Map.Entry<String, String> entry:entries){
            //获得Map元素的key
            String v3 = entry.getValue();
            //获得Map元素的value
            String k1 = entry.getKey();
            System.out.println(k1+"----→"+v3);
        }
        //把Map集合变成线程安全的（线程同步）
        Collections.synchronizedMap(m1);

        Map<Student1,String> m3 = new TreeMap<>();
        m3.put(new Student1("庄达菲",19),"庄达菲");
        m3.put(new Student1("吴景昊",20),"吴景号");
        m3.put(new Student1("莫小贝",19),"莫小贝");
        System.out.println(m3);//根据键进行排序,不允许存在null

        Map<Student1,String> m4 = new LinkedHashMap<>();
        m4.put(new Student1("吴景昊",20),"吴景号");
        m4.put(new Student1("庄达菲",19),"庄达菲");
        m4.put(new Student1("莫小贝",19),"莫小贝");
        System.out.println(m4);//输入是有顺序的（根据添加的顺序）


    }

}
