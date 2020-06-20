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
			
			System.out.println("main进入同步代码块");
			
			o.notifyAll();//从那些因为o对象而进入到无限期等待的线程中，营救一个出来
			
			System.out.println("main退出同步代码块");
		}
		
		
	}
}

class MyThread extends Thread{
	
	Object obj;
	
	public MyThread(Object obj){
		this.obj = obj;
	}
	
	public void run(){
		System.out.println(Thread.currentThread().getName() + "线程启动");
		
		
		synchronized(obj){
			System.out.println(Thread.currentThread().getName() + "进入同步代码块");
			try {
				obj.wait();//主动释放、无限期等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "退出同步代码块");
		}
		
		System.out.println(Thread.currentThread().getName() + "线程结束");
	}
	
	
//	public void run(){
//		System.out.println("线程启动");
//		
//		synchronized(obj){
//			System.out.println(Thread.currentThread().getName() + "进入同步代码块");
//			try {
//				obj.wait();//主动释放、无限期等待
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println("退出同步代码块");
//		}
//		
//		System.out.println("线程结束");
//	}
}






