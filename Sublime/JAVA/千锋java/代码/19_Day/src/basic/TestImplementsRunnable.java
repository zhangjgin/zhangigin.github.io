package basic;

public class TestImplementsRunnable {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("����ʼ");
		
		Thread.sleep(5000);
		
		MyRunnable task = new MyRunnable();//����Task�����50�Σ�
		
		Thread t1 = new Thread(task);
		
		Thread t2 = new Thread(task);
		
		t1.start();
		t2.start();
		
		System.out.println("�������");
	}

}

class MyRunnable implements Runnable{
	@Override
	public void run() {//����
		for (int i = 1; i <= 50; i++) {
			System.out.println( Thread.currentThread().getName() + " : " + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
}