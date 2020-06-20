package thread.basket1;

public class Producer extends Thread{

    private Basket b;
    public Producer(Basket ba){
        super();
        this.b = ba;
    }
    @Override
    public void run() {
        while (true) {
            //定义一个同步代码块
            synchronized (b){
                try {
                    if (!b.isEmpty()) {
                        //线程等待状态
                        b.wait();
                    }
                    System.out.println("生产水果");
                    b.setEmpty(false);
                    //通知在这个共享对象上等待的线程
                    b.notify();


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
