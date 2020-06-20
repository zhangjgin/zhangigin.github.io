package thread;

public class ThreadTest1 {
    public static void main(String[] args) {
        //创建一个线程的对象
        MyThread1 mt = new MyThread1("我的刺猬女孩");
        //启动一个线程
        mt.start();

        //创建一个线程的对象
        MyThread1 mt1 = new MyThread1("天醒之路");
        //启动一个线程
        mt1.start();








//        System.out.println("结束");

    }
}
