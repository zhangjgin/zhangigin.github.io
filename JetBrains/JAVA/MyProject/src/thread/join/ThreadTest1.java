package thread.join;

public class ThreadTest1 {
    public static void main(String[] args) {
        MyThread1 mt1 = new MyThread1("【我的刺猬女孩】");
        MyThread1 mt2 = new MyThread1("【天醒之路】");
        MyThread1 mt3 = new MyThread1("【我才不要和你做朋友】");
        mt1.start();
        try {
            //加入线程必须要在该线程的start下面
            mt1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mt2.start();
        mt3.start();









    }
}
