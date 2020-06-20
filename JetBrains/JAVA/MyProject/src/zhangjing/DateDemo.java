package zhangjing;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args){

        Integer i = new Integer(10);

        int i1 = i.intValue();

        Integer i2 = new Integer("55");
        String s2 = i2 + "";
//        System.out.println(s2);
        String s = i2.toString();
//        System.out.println(s);

        int i3 = 20;
        String s3 = i3 +"";

        int i4 = Integer.parseInt(s3);

        String s1 = Integer.toBinaryString(10);
//        System.out.println(s1);

        String s4 = Integer.toHexString(10);
//        System.out.println(s4);

        Integer a1 = new Integer(29);
        Integer a2 = new Integer(29);
//        System.out.println(a1 == a2);//错误的
//        System.out.println(a1.intValue() == a2.intValue());
        boolean equals = a1.equals(a2);
//        System.out.println(equals);

        //自动装箱
        int a3 = 10;
        Integer a4 = a3;
        //自动拆箱
        Integer a5 = new Integer(23);
        int a6 = a5;

        Integer a7 = 127;
        Integer a8 = 127;
//        System.out.println(a7 == a8);

        Integer a9 = 128;
        Integer a10 = 128;
//        System.out.println(a9 == a10);

        Date d1 = new Date();
//        System.out.println(d1);
        SimpleDateFormat d2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS E");
        String d3 = d2.format(d1);
        System.out.println(d3);

        SimpleDateFormat d4 = new SimpleDateFormat("yyyy年MM年dd天 HH时mm分ss秒SSS毫秒 E");
        String d5 = d4.format(d1);
        System.out.println(d5);

        String s5 = "2020-12-12 12:12:12";
        SimpleDateFormat d8 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d9 = d8.parse(s5);
            System.out.println(d9);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}