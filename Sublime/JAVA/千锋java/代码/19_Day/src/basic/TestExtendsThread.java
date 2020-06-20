package basic;

public class TestExtendsThread {

	public static void main(String[] args) {//主线程  5ms
		
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		//t1.run();  //Error
		//t2.run();  //Error 普通方法调用
		
		t1.start();//启动线程
		t2.start();//启动线程
		
		//5ms
		
		for (int i = 1; i <= 50; i++) {
			System.out.println("Main: " + i);
		}
		
		
		System.out.println("程序结束");
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

