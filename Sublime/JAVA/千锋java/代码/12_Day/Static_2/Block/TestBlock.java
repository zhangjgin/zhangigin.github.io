public class TestBlock{
	public static void main(String[] args){
		
		//静态代码块是由类加载触发的
		
		//MyClass.sMethod();
		
		new MyClass();
	}
}

class MyClass{

	static String sField = "---initialed sField---";

	static{
		//静态代码块
		System.out.println(sField);
		System.out.println("---MyClass Static Block---");
	}
	
	public static void sMethod(){
		System.out.println("---sMethod() Executed---");
	}
	
	
	int a = 10;
	
	{
		//动态代码块
		System.out.println(a);
		System.out.println("---MyClass Dynamic Block---");
	}
	
	public MyClass(){
		
		System.out.println("---MyClass()---");
	}
	
	public void m1(){
		
		{//代码块
			int a = 10;
		}
	}
	
	
}