package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {

	public static void main(String[] args) {// ���߳�

		// �̳߳أ����ã� ---> Executors�����ࣨ�����ࣩ
		ExecutorService es = Executors.newFixedThreadPool(3);

		Runnable task = new MyTask();

		es.submit(task);

		es.submit(task);

		es.submit(task);

		es.submit(task);
		
	}
}

class MyTask implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			System.out.println(Thread.currentThread().getName() + " MyTask:"
					+ i);
		}
	}
}