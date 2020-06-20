package chp11;

import java.util.Scanner;

class MyException1 extends Exception {

	public MyException1() {
		super();
	}

	public MyException1(String message) {
		super(message);
	}

}

class MyException2 extends RuntimeException {

	public MyException2() {
		super();
	}

	public MyException2(String message) {
		super(message);
	}

}

public class TestMyException {

	public static void main(String args[]) {
		int n;
		// ����n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try {
			m(n);
		} catch (MyException1 ex1) {
			// ���ex1��ϸ�ķ�������ջ��Ϣ
			ex1.printStackTrace();
		} catch (MyException2 ex2) {
			// ���ex2����ϸ��Ϣ
			System.out.println(ex2.getMessage());
			// ����ex2�����׳�
			throw ex2;
		}
	}

	public static void m(int n) throws MyException1 { // �����׳�MyException1
		if (n == 1) {
			// �׳�MyException1
			// ���趨����ϸ��ϢΪ��n == 1��
			throw new MyException1("n == 1");
		} else {
			// �׳�MyException2
			// ���趨����ϸ��ϢΪ��n == 2��
			throw new MyException2("n == 2");
		}
	}

}
