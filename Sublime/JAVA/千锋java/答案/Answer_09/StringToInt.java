package chp9;

import java.util.Scanner;
public class StringToInt {

	public static void main(String[] args) {
		String str = sc.nextLine();
		
		//��һ��������str --> int
		int i1 = Integer.parseInt(str);
		System.out.println(i1);
		
		//�ڶ���������str --> Integer --> int
		Integer ii = new Integer(str);
		int i2 = ii.intValue();
		System.out.println(i2);
		
	}
}
