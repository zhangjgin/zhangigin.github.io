package thread;

import java.util.Date;

public class SleepThreadDemo {
    public static void main(String[] args) {
        while (true) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class MyThread implements Runnable{
        static Object obj = new Object();
        @Override
        public void run() {
            while (true) {
                synchronized (obj){
                    try {
                        //休眠在synchronize内部就不会让出CPU资源
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}
