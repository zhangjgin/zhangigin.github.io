package thread;
/*这个类是买票的窗口，我们创建4个对象就是四个窗口
* */
public class ScaleTicketThread extends Thread{
    private String name;
    /*定义共享的数据100张票*/
    static int tickets = 10;
    //创建一个锁对象，这个对象是多个线程对象共享的数据
    static  Object obj = new Object();
    @Override
    public void run() {
        //买票是持续的
        while (true) {
            synchronized (obj){
                if (tickets > 0) {
                    System.out.println(name+"卖出座位是："+(tickets--)+"号");
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
        System.out.println(name+"买票结束！");
    }

    public ScaleTicketThread(String name) {
        this.name = name;
    }
}
