package thread.deadlock;

public class DeadLockDemo extends Thread {
    int flag;

    @Override
    public void run() {
        if (flag == 1) {
            synchronized (Lock.lock1) {
                System.out.println("进入锁1");
                synchronized (Lock.lock2) {
                    System.out.println("进入锁1中的锁2");

                }
            }
        } else {
            synchronized (Lock.lock2) {
                System.out.println("进入锁2");
                synchronized (Lock.lock1) {
                    System.out.println("进入锁2中的锁1");

                }
            }
        }
    }
}
