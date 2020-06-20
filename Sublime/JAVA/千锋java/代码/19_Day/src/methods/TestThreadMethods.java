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
				t2.join();//��t2���뵽��main�߳��У��ȴ�t2�̵߳Ľ�������ִ�С�
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
				Thread.yield();//������ʽʱ��Ƭ
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