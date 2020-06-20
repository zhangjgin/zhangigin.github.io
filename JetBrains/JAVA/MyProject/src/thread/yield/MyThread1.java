package thread.yield;

public class MyThread1 extends Thread {
    private String name;
    public MyThread1(String name){
        this.name = name;
    }


    /*
    * 这就是线程执行的逻辑体
    * */
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(name+"下载了"+i+"%");
            //让出线程
            Thread.yield();
        }
    }
}
