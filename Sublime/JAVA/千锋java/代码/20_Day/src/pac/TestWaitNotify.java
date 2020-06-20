package pac;

public class TestWaitNotify {

	public static void main(String[] args) throws InterruptedException {
		
		Object o = new Object();
		
		MyThread t1 = new MyThread(o);
		
		MyThread t2 = new MyThread(o);
		
		t1.start();
		t2.start();
		
		Thread.sleep(10000);
		
		synchronized(o){
			
			System.out.println("main����ͬ�������");
			
			o.notifyAll();//����Щ��Ϊo��������뵽�����ڵȴ����߳��У�Ӫ��һ������
			
			System.out.println("main�˳�ͬ�������");
		}
		
		
	}
}

class MyThread extends Thread{
	
	Object obj;
	
	public MyThread(Object obj){
		this.obj = obj;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName() + "�߳�����");
		
		
		synchronized(obj){
			System.out.println(Thread.currentThread().getName() + "����ͬ�������");
			try {
				obj.wait();//�����ͷš������ڵȴ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "�˳�ͬ�������");
		}
		
		System.out.println(Thread.currentThread().getName() + "�߳̽���");
	}
	
	
//	public void run(){
//		System.out.println("�߳�����");
//		
//		synchronized(obj){
//			System.out.println(Thread.currentThread().getName() + "����ͬ�������");
//			try {
//				obj.wait();//�����ͷš������ڵȴ�
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("�˳�ͬ�������");
//		}
//		
//		System.out.println("�߳̽���");
//	}
}






