package jihe;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add(null);
        a1.add(null);
        a1.add(null);
        a1.add(null);
        System.out.println(a1);
        a1.set(2,"庄达菲");//修改指定索引处的值
        System.out.println(a1);
    }


}
