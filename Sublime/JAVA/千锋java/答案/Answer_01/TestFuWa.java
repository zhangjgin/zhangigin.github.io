package chp2;

import java.util.Scanner;

public class TestFuWa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("±´±´");
			break;
		case 2:
			System.out.println("¾§¾§");
			break;
		case 3:
			System.out.println("»¶»¶");
			break;
		case 4:
			System.out.println("Ó­Ó­");
			break;
		case 5:
			System.out.println("ÄÝÄÝ");
			break;
		default:
			System.out.println("±±¾©»¶Ó­Äã");
		}
	}
}
