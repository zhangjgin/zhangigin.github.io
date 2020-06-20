package syn;

public class TestSynchronized {
	public static void main(String[] args) {

		// 按照该卡号进行了开户，并存入了2000元
		Account acc = new Account("1001", "123456", 2000D);// 0x11223344

		Husband h = new Husband(acc);

		Wife w = new Wife(acc);
		
		Son s = new Son(acc);

		Thread t1 = new Thread(h);

		Thread t2 = new Thread(w);
		
		Thread t3 = new Thread(s);

		t1.start();// Husband
		t2.start();// Wife
		t3.start();// Son

	}
}

class Husband implements Runnable {
	Account acc;

	public Husband(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		// synchronized(acc){//对acc对象加锁
		this.acc.withdrawal("1001", "123456", 1200D);
		// }
	}

}

class Wife implements Runnable {
	Account acc;

	public Wife(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		// synchronized(acc){
		this.acc.withdrawal("1001", "123456", 1200D);
		// }
	}
}

class Son implements Runnable {
	Account acc;

	public Son(Account acc) {
		this.acc = acc;
	}

	@Override
	public void run() {
		// synchronized(acc){
		this.acc.withdrawal("1001", "123456", 1200D);
		// }
	}
}

// 银行账户
// this = 0x11223344
class Account {
	String cardNo;
	String password;// w
	double balance;

	public Account(String cardNo, String password, double balance) {
		super();
		this.cardNo = cardNo;
		this.password = password;
		this.balance = balance;
	}

	// 取款
	public void withdrawal(String no, String pwd, double money) {

		// Wife
		synchronized (this) {// this = acc (0x11223344)
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
		}
		// Husband
	}
}