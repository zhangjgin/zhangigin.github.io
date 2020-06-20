package thread.basket1;

public class ThreadTest6 {
    public static void main(String[] args) {
        Basket ba = new Basket();
        Producer p = new Producer(ba);
        Consumer c = new Consumer(ba);
        p.start();
        c.start();
    }
}
