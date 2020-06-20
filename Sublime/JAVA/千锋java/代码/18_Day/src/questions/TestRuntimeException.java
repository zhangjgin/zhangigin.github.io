package questions;

import java.util.Scanner;

public class TestRuntimeException {

	public static void main(String[] args) {
		m6();
	}
	
	//java.lang.NullPointerException
	public static void m1(){
		Object o = null;
		
		o.hashCode();
	}
	
	//java.lang.ArrayIndexOutOfBoundsException
	public static void m2(){
		int[] nums = new int[4];
		
		System.out.println(nums[5]);
	}
	
	//java.lang.StringIndexOutOfBoundsException
	public static void m3(){
		String str = "abc";
		
		System.out.println(str.charAt(5));
	}
	
	//java.lang.ArithmeticException
	public static void m4(){
		System.out.println(3/0);
	}

	//java.lang.ClassCastException
	public static void m5(){
		Object o = new Integer(123);
		Scanner input = (Scanner)o;
	}
	
	//java.lang.NumberFormatException
	public static void m6(){
		new Integer("10a");
	}
}
