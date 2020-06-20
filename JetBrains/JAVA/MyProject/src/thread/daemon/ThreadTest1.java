package thread.daemon;

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1("【我的刺猬女孩】");
        mt1.setDaemon(true);
        mt1.start();
        System.out.println("主线程结束");










    }
}
