package pac;

import java.util.ArrayList;
import java.util.List;

public class TestProduceAndConsumer {

	public static void main(String[] args) {
		
		MyQueue mq = new MyQueue();
		
		Produce1 p1 = new Produce1(mq);
		Produce2 p2 = new Produce2(mq);
		Consumer c1 = new Consumer(mq);
		
		p1.start();
		p2.start();
		c1.start();
		
		
		System.out.println("main end");
	}
}

class Consumer extends Thread{
	MyQueue mq;
	public Consumer(MyQueue mq){
		this.mq = mq;
	}
	
	public void run(){
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(mq.poll() + "被移除");
		}
	}
}

class Produce1 extends Thread{
	MyQueue mq;
	public Produce1(MyQueue mq){
		this.mq = mq;
	}
	
	public void run(){
		System.out.println("Produce1启动");
		for (char ch = 'A'; ch <= 'E'; ch++) {
			mq.offer(ch);
		}
		System.out.println("Produce1结束");
	}
}

class Produce2 extends Thread{
	MyQueue mq;
	public Produce2(MyQueue mq){
		this.mq = mq;
	}
	
	public void run(){
		System.out.println("Produce2启动");
		for (char ch = 'F'; ch <= 'J'; ch++) {
			mq.offer(ch);
		}
		System.out.println("Produce2结束");
	}
}

//我的队列
class MyQueue {
	
	private List values = new ArrayList();
	
	private int max = 4;
	
	//存入队列
	public synchronized void offer(Object o){//E
		
		while(values.size() == max){
			//进来线程，停下
			try {
				this.wait();
				//被唤醒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		
		System.out.println(Thread.currentThread().getName() + "存入第"+ (values.size() + 1) +"个元素");
		
		values.add(o);
	}
	
	//从队列取出
	public synchronized Object poll(){//1个元素 
		
		while(values.size() == 0){
			try {
				this.wait();
				//被唤醒
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.notifyAll();//唤醒因mq对象而进入无限期等待的线程对象（一个）
		
		return values.remove(0);
	}
	
	
	public void show(){
		for (Object obj : values) {
			System.out.println(obj);
		}
	}
}







