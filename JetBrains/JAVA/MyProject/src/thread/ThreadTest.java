package thread;

public class ThreadTest {
    public static void main(String[] args) {
        ScaleTicketThread s1 = new ScaleTicketThread("窗口1");
        ScaleTicketThread s2 = new ScaleTicketThread("窗口2");
        ScaleTicketThread s3 = new ScaleTicketThread("窗口3");
        ScaleTicketThread s4 = new ScaleTicketThread("窗口4");
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
