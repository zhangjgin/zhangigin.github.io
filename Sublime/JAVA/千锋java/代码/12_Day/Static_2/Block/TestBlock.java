public class TestBlock{
	public static void main(String[] args){
		
		//��̬�������������ش�����
		
		//MyClass.sMethod();
		
		new MyClass();
	}
}

class MyClass{

	static String sField = "---initialed sField---";

	static{
		//��̬�����
		System.out.println(sField);
		System.out.println("---MyClass Static Block---");
	}
	
	public static void sMethod(){
		System.out.println("---sMethod() Executed---");
	}
	
	
	int a = 10;
	
	{
		//��̬�����
		System.out.println(a);
		System.out.println("---MyClass Dynamic Block---");
	}
	
	public MyClass(){
		
		System.out.println("---MyClass()---");
	}
	
	public void m1(){
		
		{//�����
			int a = 10;
		}
	}
	
	
}