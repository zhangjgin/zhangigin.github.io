package methods;

public class TestThreadMethods {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Task1());
		
		Thread t2 = new Thread(new Task2());
		
		//t1.start();
		
		t2.start();
		
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println("main:" + i);
			if(i == 200){
				t2.join();//将t2加入到我main线程中，等待t2线程的结束后，再执行。
			}
		}
	}
}

class Task1 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("Task1:" + i);
			if(i % 10 == 0){
				Thread.yield();//主动方式时间片
			}
		}
	}
}


class Task2 implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println("---Task2:" + i);
		}
	}
}