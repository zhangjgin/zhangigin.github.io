package member;

public class TestMemberClass {
	public static void main(String[] args) {
		//Inner in = new Inner();//Error 不能脱离外部类对象而独立存在
		
		Outer out = new Outer();
		
		//创建成员内部类的对象（必须依赖外部类对象）
		Outer.Inner in = out.new Inner();
		
		//System.out.println(in.b);
		
		in.m2();
		
		//System.out.println(out.a);//Error 封装依旧有效，无法从外部直接访问

		//Outer.Inner.field //Error 无法脱离外部类对象进行静态的调用
	}
}

class Outer{
	
	private int a = 10;
	
	//成员内部类，依赖外部类对象
	class Inner{
		
		int a = 20;
		
		/*static*/ String field = "abc";//成员内部类不能定义静态成员	
		
		public void m2(){
			int a = 30;
			System.out.println("inner method - m2() " + a);//内部类可以自身局部变量
			System.out.println("inner method - m2() " + this.a);//内部类可以访问内部类的实例变量
			System.out.println("inner method - m2() " + Outer.this.a);//内部类可以访问外部类实例变量
		}
		
	}
}



