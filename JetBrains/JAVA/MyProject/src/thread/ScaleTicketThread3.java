package thread;
/*这个类是买票的窗口，我们创建4个对象就是四个窗口
* */
public class ScaleTicketThread3 extends Thread{
    private String name;

    public ScaleTicketThread3(String name) {
        super(name);
        this.name = name;
    }

    private static int tickets = 100;

      Object obj = new Object();
    @Override
    public void run() {
        //买票是持续的
        while (true) {
            if (scaleTickets()) {
                break;
            }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName()+"买票结束！");
        }



    public static boolean scaleTickets(){

        boolean isFinish  = false;
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName()+"卖出座位是："+(tickets--)+"号");
        }else{
            isFinish = true;


        }
        return isFinish;
    }
    }



