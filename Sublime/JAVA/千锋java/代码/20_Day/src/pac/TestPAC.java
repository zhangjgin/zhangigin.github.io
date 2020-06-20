package pac;

public class TestPAC {
	public static void main(String[] args) {

		final MyStack ms = new MyStack();//�ٽ���Դ

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
		
		this.notifyAll();//�Ȼ��ѶԷ�

		while (values.length == size) {
			System.out.println("����");
			
			try { this.wait(); } catch (Exception e) {}
		}

		System.out.println(str + "��ջ");
		values[size] = str;
		size++;
	}

	public synchronized void pop() {
		
		this.notifyAll();//�Ȼ��ѶԷ�
		
		while (size == 0) {
			System.out.println("����");
			
			try { this.wait(); } catch (Exception e) {}
		}

		System.out.println(values[size - 1] + "��ջ");
		values[size - 1] = "";
		size--;
	}
}