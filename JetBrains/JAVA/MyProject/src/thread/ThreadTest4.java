package thread;

public class ThreadTest4 {
    public static void main(String[] args) {
        //创建一个买票是对象
       ScaleTicketThread2 s = new ScaleTicketThread2();
       Thread t1 = new Thread(s,"窗口1");
       Thread t2 = new Thread(s,"窗口2");
       Thread t3 = new Thread(s,"窗口3");
       Thread t4 = new Thread(s,"窗口4");

       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }

}
