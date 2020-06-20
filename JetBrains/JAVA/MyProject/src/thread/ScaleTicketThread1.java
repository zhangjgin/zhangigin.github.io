package thread;

public class ScaleTicketThread1 implements Runnable{

     int tickets = 10;

     Object obj = new Object();



    @Override
    public void run() {
        //买票是持续的
        while (true) {
            synchronized (obj){
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName()+"卖出座位是："+(tickets--)+"号");
                }else{
                    break;
                }
            }

            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        System.out.println(Thread.currentThread().getName()+"买票结束！");
    }
}
