package jihe;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        lk.add("小贝");
        lk.add("庄达菲");
        lk.add("吴景昊");
        lk.addFirst("百川高中");
        lk.addLast("刺猬女孩");
        lk.removeFirst();
        lk.removeLast();
        System.out.println(lk);

        //把队列看做是一个 栈，出栈是从头开始的
        Object p = lk.pop();
        System.out.println("出栈的元素：" + p);

        //压栈
        lk.push("马俊涛");
        System.out.println(lk);
    }
}
