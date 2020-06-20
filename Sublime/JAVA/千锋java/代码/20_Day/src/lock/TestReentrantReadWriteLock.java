package lock;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class TestReentrantReadWriteLock {

	public static void main(String[] args) {
		
		final Student s = new Student();
		
		Callable<Object> writeTask = new Callable<Object>(){
			@Override
			public Object call() throws Exception {
				s.setValue(111);
				return null;
			}
		};
		
		Callable<Object> readTask = new Callable<Object>(){
			@Override
			public Object call() throws Exception {
				s.getValue();
				return null;
			}
		};
		
		
		ExecutorService es = Executors.newFixedThreadPool(20);
		
		//��ʼʱ��
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 2; i++) {
			es.submit(writeTask);
		}
		
		for (int i = 0; i < 18; i++) {
			es.submit(readTask);
		}
		
		
		//ֹͣ�̳߳أ����ڽ����µ����񣬽���������ȫ��ִ����ϣ�
		es.shutdown();
		
		while(true){
			System.out.println("��������");
			if(es.isTerminated()){
				break;
			}
		}
		
		//.....
		System.out.println(System.currentTimeMillis() - start);
		
	}

}

class Student{
	
	//ReentrantLock rLock = new ReentrantLock();
	ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	ReadLock rl = rwl.readLock();
	WriteLock wl = rwl.writeLock();
	
	int value;

	
	//��
	public int getValue() {
		
		rl.lock();
		try {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			return this.value;
			
		} finally{
			rl.unlock();
		}
	}

	//д
	public void setValue(int value) {
		wl.lock();
		try {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			this.value = value;
			
		} finally{
			wl.unlock();
		}
	}
	
	
}