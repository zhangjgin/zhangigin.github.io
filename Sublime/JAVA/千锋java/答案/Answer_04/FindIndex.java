package chp5;

import java.util.Scanner;
public class FindIndex {
	public static void main(String[] args) {
		//�Զ�������a
		int[] a = {1,3,5,7,9};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<a.length; i++){
			if (n == a[i]){
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}
