package chp14;

public class TestThread {
	public static void main(String[] args) {
		Thread t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		Thread t3 = new Thread(t2);
		t1.start();
		t3.start();
	}
}
class MyThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 27; i++) {
			System.out.println(i);
		}
	}
}
class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(char i = 'A';i<='Z';i++){
			System.out.println(i);
		}
	}
	
}
