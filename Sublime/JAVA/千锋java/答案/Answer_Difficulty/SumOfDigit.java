package chp3;

import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		while(n != 0){
			sum += n % 10; //��õ�λ��ֵ�����ӵ�sum��
			n = n / 10;	   //ȥ����λ��ֵ
		}
		System.out.println(sum);
	}
}
