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
			System.out.println(mq.poll() + "���Ƴ�");
		}
	}
}

class Produce1 extends Thread{
	MyQueue mq;
	public Produce1(MyQueue mq){
		this.mq = mq;
	}
	
	public void run(){
		System.out.println("Produce1����");
		for (char ch = 'A'; ch <= 'E'; ch++) {
			mq.offer(ch);
		}
		System.out.println("Produce1����");
	}
}

class Produce2 extends Thread{
	MyQueue mq;
	public Produce2(MyQueue mq){
		this.mq = mq;
	}
	
	public void run(){
		System.out.println("Produce2����");
		for (char ch = 'F'; ch <= 'J'; ch++) {
			mq.offer(ch);
		}
		System.out.println("Produce2����");
	}
}

//�ҵĶ���
class MyQueue {
	
	private List values = new ArrayList();
	
	private int max = 4;
	
	//�������
	public synchronized void offer(Object o){//E
		
		while(values.size() == max){
			//�����̣߳�ͣ��
			try {
				this.wait();
				//������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notifyAll();
		
		System.out.println(Thread.currentThread().getName() + "�����"+ (values.size() + 1) +"��Ԫ��");
		
		values.add(o);
	}
	
	//�Ӷ���ȡ��
	public synchronized Object poll(){//1��Ԫ�� 
		
		while(values.size() == 0){
			try {
				this.wait();
				//������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.notifyAll();//������mq��������������ڵȴ����̶߳���һ����
		
		return values.remove(0);
	}
	
	
	public void show(){
		for (Object obj : values) {
			System.out.println(obj);
		}
	}
}







