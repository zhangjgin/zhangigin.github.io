package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestSynchronized {
	public static void main(String[] args) throws Exception {

		Account acc = new Account("1001", "123456", 2000D);

		Husband h = new Husband(acc);
		Wife w = new Wife(acc);

		// �����߳�
		Thread t1 = new Thread(h);
		Thread t2 = new Thread(w);

		t1.start();
		t2.start();

	}
}

class Husband implements Runnable {
	Account acc;

	public Husband(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		this.acc.withdrawal("1001", "123456", 1200D);
	}

}

class Wife implements Runnable {
	Account acc;

	public Wife(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		this.acc.withdrawal("1001", "123456", 1200D);
	}
}

class Account {
	//������
	Lock locker = new ReentrantLock();
	
	String cardNo;
	String password;
	double balance;

	public Account(String cardNo, String password, double balance) {
		super();
		this.cardNo = cardNo;
		this.password = password;
		this.balance = balance;
	}

	public void withdrawal(String no, String pwd, double money) {
		//������   synchronized(this){
		locker.lock();
		try{
			System.out.println("���Ժ󡣡���");
			if (this.cardNo.equals(no) && this.password.equals(pwd)) {
				System.out.println("��֤�ɹ������Ժ󡣡�");
				if (money < balance) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					balance -= money;
					System.out.println("ȡ��ɹ�����ǰ���Ϊ��" + balance);
				} else {
					System.out.println("��������!");
				}
			} else {
				System.out.println("���Ż��������!");
			}
		}finally{
			//�ͷ���  }
			locker.unlock();
		}
	}
}