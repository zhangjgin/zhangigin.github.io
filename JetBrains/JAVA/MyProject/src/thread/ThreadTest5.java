package thread;

public class ThreadTest5 {
    public static void main(String[] args) {
       ScaleTicketThread3 s1 = new ScaleTicketThread3("窗口1");
       ScaleTicketThread3 s2 = new ScaleTicketThread3("窗口2");
       ScaleTicketThread3 s3 = new ScaleTicketThread3("窗口3");
       ScaleTicketThread3 s4 = new ScaleTicketThread3("窗口4");
       s1.start();
       s2.start();
       s3.start();
       s4.start();
    }

}
