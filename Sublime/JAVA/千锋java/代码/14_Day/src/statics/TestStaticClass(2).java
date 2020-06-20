package statics;

public class TestStaticClass {

	public static void main(String[] args) {

		//外部类的静态属性
		System.out.println(Outer.a);
		
		//外部类的静态方法
		Outer.m1();
		
		
		//创建静态内部类对象时，可以直接通过完整名称进行创建
		Outer.Inner in = new Outer.Inner();//静态内部类的创建，不依赖外部类的对象
		
		//创建内部类对象后，访问实例属性和方法
		System.out.println(in.b);
		in.m2();

		//&&额外比成员内部类多了一个定义的内容（静态属性和静态方法）&&
		
		//通过外部类类名.内部类类名.内部类的静态属性
		System.out.println(Outer.Inner.field);
		//通过外部类类名.内部类类名.内部类的静态方法
		Outer.Inner.m3();

	}
}


class Outer{
	
	static int a = 10;
	
	static class Inner{
		
		int b = 20;
		
		static String field = "abc";
		
		public void m2(){
			System.out.println("Inner m2()");
		}
		
		public static void m3(){
			System.out.println(a);
		}
		
	}
	
	static void m1(){
		System.out.println("Outer m1()");
	}
	
}