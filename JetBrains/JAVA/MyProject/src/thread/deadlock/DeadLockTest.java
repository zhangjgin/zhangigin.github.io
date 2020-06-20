package thread.deadlock;

public class DeadLockTest {
    public static void main(String[] args) {
        DeadLockDemo dl1 = new DeadLockDemo();
        dl1.flag = 1;
        DeadLockDemo dl2 = new DeadLockDemo();
        dl1.start();
        dl2.start();
    }
}
