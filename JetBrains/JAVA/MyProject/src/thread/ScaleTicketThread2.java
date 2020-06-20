package thread;

public class ScaleTicketThread2 implements Runnable{

     int tickets = 10;

     Object obj = new Object();



    @Override
    public void run() {
        //买票是持续的
        while (true) {
            if (scaleTickets()) {
                break;
            }
            }

            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        System.out.println(Thread.currentThread().getName()+"买票结束！");
        }


    /*public boolean scaleTickets(){

        synchronized (obj){
            boolean isFinish  = false;
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName()+"卖出座位是："+(tickets--)+"号");
            }else{
                isFinish = true;
            }
            return isFinish;
        }

    }*/
    /*
    * 如果一个对象方法上有synchronize的话那么锁的对象就是this
    * */
    public synchronized boolean scaleTickets(){

        //synchronized (obj){
            boolean isFinish  = false;
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName()+"卖出座位是："+(tickets--)+"号");
            }else{
                isFinish = true;
            }
            return isFinish;
        //}

    }
}


