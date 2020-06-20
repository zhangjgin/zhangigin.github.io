package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestSynchronized {
	public static void main(String[] args) throws Exception {

		Account acc = new Account("1001", "123456", 2000D);

		Husband h = new Husband(acc);
		Wife w = new Wife(acc);

		// 三个线程
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
	//锁对象
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
		//开启锁   synchronized(this){
		locker.lock();
		try{
			System.out.println("请稍后。。。");
			if (this.cardNo.equals(no) && this.password.equals(pwd)) {
				System.out.println("验证成功，请稍后。。");
				if (money < balance) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					balance -= money;
					System.out.println("取款成功，当前余额为：" + balance);
				} else {
					System.out.println("卡内余额不足!");
				}
			} else {
				System.out.println("卡号或密码错误!");
			}
		}finally{
			//释放锁  }
			locker.unlock();
		}
	}
}