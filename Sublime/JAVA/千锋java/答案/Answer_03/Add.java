package chp4;

public class Add {
	public static void main(String[] args) throws Exception{
		System.out.println("请输入两个整数：");
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
