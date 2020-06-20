public class TestSuperKeyword{
	public static void main(String[] args){
		
		Son son = new Son();
		
		//son.method();
		
		son.m2();
	}
}

class Father{
	
	int field = 10;

	public void m1(){
		System.out.println("--Father -- m1()--");
	}
	
}

class Son extends Father{
	
	int field = 20;
	
	public void method(){
		System.out.println(super.field);//super. 用以访问父类的属性和方法
		System.out.println(this.field);//this. 用以访问自身的属性和方法
	}
	
	public void m1(){
		System.out.println("--Son -- m1()--");
	}
	
	public void m2(){
		super.m1();
		System.out.println("--Son -- m2()--");
	}
	
	
	
}