package jihe;

public class DynamicParamDemo {
    public static void main(String[] args) {
//        int result = add(10,12);
        int result = add(new int[]{12,12,12});
        System.out.println(result);
    }
    //数据类型...变量这是可变参数是定义方式
    //可以代表数组，还可以代表单个数的传递
    //如果调用的时候我们发现了正好能匹配的方法就不会调用可变参数的方法，如果不存在就会调用可变参数的方法
    public static int add(int... a){
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }
}
