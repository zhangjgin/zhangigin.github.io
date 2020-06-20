package thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new Thread(new MyThread2("我的刺猬女孩"));
        Thread t1 = new Thread(new MyThread2("王者荣耀"));
        t.start();
        t1.start();
    }

}
