package jihe;

import java.util.Arrays;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        String s = Arrays.toString(arr);
        System.out.println(s);

        float[] f = {12.1f,45.2f,1.4f};
        System.out.println(Arrays.toString(f));

        Student[] s1 = new Student[2];
        s1[0] = new Student(180236,"庄达菲",20);
        s1[1] = new Student(180237,"韩菲",19);
        System.out.println(Arrays.toString(s1));

        int[] arr1 = {12,1,2,3,4,5,6,7};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Student1[] s2 = new Student1[3];
        s2[0] = new Student1("庄达菲",19);
        s2[1] = new Student1("韩菲",20);
        s2[2] = new Student1("小贝",19);
        //对数组中的对象来排序，数组中的对象必须要实现comparable接口
        Arrays.sort(s2);
        System.out.println(Arrays.toString(s2));

        System.out.println("---------------二分法查找-----------------------------");
        int i = Arrays.binarySearch(arr, 6);
        System.out.println(i);

        //把数组转换成list
        //我们不能把基本数据类型转换成集合，如果传递了基本数据类型的集合，就会把数组的类型作为泛型
        Integer[] arr2 = {1,2,3,4,5,6,7};
        List<Integer> l1 = Arrays.asList(arr2);
        System.out.println(l1);
        //如果数组转换成集合，长度不能改变
//        l1.add(11);
    }
}
