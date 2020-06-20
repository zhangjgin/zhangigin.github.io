package pac;

public class TestPAC {
	public static void main(String[] args) {

		final MyStack ms = new MyStack();//临界资源

		Thread t1 = new Thread() {
			public void run() {
				for (char ch = 'A'; ch <= 'Z'; ch++) {
					ms.push(ch+"");
				}
			}
		};

		Thread t2 = new Thread(){
			public void run(){
				for (int i = 0; i < 26; i++) {
					ms.pop();
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}

// Last In First Out
class MyStack {

	private String[] values = new String[] { "", "", "", "", "" };

	int size = 0;

	public synchronized void push(String str) {
		
		this.notifyAll();//先唤醒对方

		while (values.length == size) {
			System.out.println("满了");
			
			try { this.wait(); } catch (Exception e) {}
		}

		System.out.println(str + "入栈");
		values[size] = str;
		size++;
	}

	public synchronized void pop() {
		
		this.notifyAll();//先唤醒对方
		
		while (size == 0) {
			System.out.println("空了");
			
			try { this.wait(); } catch (Exception e) {}
		}

		System.out.println(values[size - 1] + "出栈");
		values[size - 1] = "";
		size--;
	}
}