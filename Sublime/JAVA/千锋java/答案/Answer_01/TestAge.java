package chp2;

import java.util.Scanner;
public class TestAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 6){
			System.out.println("��ͯ");
		}else if (age <=13){
			System.out.println("�ٶ�");
		}else if (age <=18){
			System.out.println("������");
		}else if (age <=35){
			System.out.println("����");
		}else if (age <=50){
			System.out.println("����");
		}else {
			System.out.println("������");
		}
	}
}
