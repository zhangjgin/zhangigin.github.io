package basic;

public class TestExtendsThread {

	public static void main(String[] args) {//���߳�  5ms
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		//t1.run();  //Error
		//t2.run();  //Error ��ͨ��������
		
		t1.start();//�����߳�
		t2.start();//�����߳�
		
		//5ms
		
		for (int i = 1; i <= 50; i++) {
			System.out.println("Main: " + i);
		}
		
		
		System.out.println("�������");
	}
}


class MyThread1 extends Thread{
	public void run(){
		for (int i = 1; i <= 50; i++) {
			System.out.println("MyThread1: " + i);
		}
	}
}


class MyThread2 extends Thread{
	public void run(){
		for (int i = 1; i <= 50; i++) {
			System.out.println("---MyThread2: " + i);
		}
	}
}

