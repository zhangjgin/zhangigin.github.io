package thread.basket2;

public class ThreadTest6 {
    public static void main(String[] args) {
        Basket ba = new Basket();
        Producer p = new Producer(ba);
        Consumer c = new Consumer(ba);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();

    }
}
