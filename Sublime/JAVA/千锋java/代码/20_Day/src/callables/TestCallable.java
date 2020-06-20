package callables;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		System.out.println("程序开始");
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Callable<Integer> task1 = new MyTask1();
		Callable<Integer> task2 = new MyTask2();
		
		Future<Integer> f1 = es.submit(task1);
		Future<Integer> f2 = es.submit(task2);
		
		Integer result1 = f1.get();//无限期等待
		Integer result2 = f2.get();//无限期等待
		
		System.out.println(result1 + result2);
		
	}
}


class MyTask1 implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		
		Thread.sleep(5000);
		
		Integer sum = 0;
		
		for (int i = 1; i <= 50; i++) {
			sum += i;
		}
		
		return sum;
	}
}

class MyTask2 implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		
		Thread.sleep(5000);
		
		Integer sum = 0;
		
		for (int i = 51; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
}


