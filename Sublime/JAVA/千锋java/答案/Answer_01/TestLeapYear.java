package chp2;

import java.util.Scanner;

public class TestLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) // �ܱ�4�������ܱ�100
				|| year % 400 == 0) { // �ܱ�400����
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}
	}
}
