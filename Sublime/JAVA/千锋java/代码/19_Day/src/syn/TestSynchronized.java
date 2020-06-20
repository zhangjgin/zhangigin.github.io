package syn;

public class TestSynchronized {
	public static void main(String[] args) {

		// ���ոÿ��Ž����˿�������������2000Ԫ
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
		// synchronized(acc){//��acc�������
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

// �����˻�
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

	// ȡ��
	public void withdrawal(String no, String pwd, double money) {

		// Wife
		synchronized (this) {// this = acc (0x11223344)
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
		}
		// Husband
	}
}