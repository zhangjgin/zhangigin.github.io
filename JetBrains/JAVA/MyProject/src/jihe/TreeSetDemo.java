package jihe;

public class TreeSetDemo {
    public static void main(String[] args) {
        String s = "aa";
        String s1 = "aa";
        //字符串的比较规则是先按着第一个字符来比较，如果说一个字符串的第一个字符比另一个字符串的首字符大，那么前者就大
        //如果是整数说明s大，如果是负数说明s小，如果是0则说明是相等的
        int i = s.compareTo(s1);
        System.out.println(i);

    }
}
