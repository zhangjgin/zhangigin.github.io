package chp4;

public class Add {
	public static void main(String[] args) throws Exception{
		System.out.println("����������������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=add(a,b);
		System.out.println("a+b="+sum);
	}
	public static int add(int a,int b){
		return (a+b);	
	}
}
