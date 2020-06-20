package chp4;

import java.util.Scanner;

public class GoldBach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 3; i<= n/2; i+=2){
			//°Ñn²ð³ÉiºÍn-i
			//·Ö±ðÅÐ¶ÏiºÍn-1ÊÇ·ñÎªÖÊÊý
			//Èç¹ûÕâÁ½¸öÊý¶¼ÎªÖÊÊý£¬ÔòÖ¤Ã÷ÕâÊÇÒ»×é½â
			if (isPrime(i) && isPrime(n-i)){
				System.out.println(n + "=" + i + "+" + (n-i));
			}
		}
	}
	public static boolean isPrime(int n){
		for(int i = 2; i<=Math.sqrt(n); i++){
			if (n % i == 0) return false;
		}
		return true;
	}
}
