public class TestAccessNotStatic{
	
	public static void main(String[] args){
		/*
		new A();
		new A();
		new A();
		
		A.staticMethod();
		
		//静态方法是可以通过类名调用的（在调用该方法时，可能从未创建过对象）
		*/
		
		
		//B.staticMethod();//建议使用类名访问
		
		
		A a = new B();//多态
		
		a.staticMethod();//a  --> A.staticMethod()
		
		//Java中的方法调用，分为两种
		
		//1.静态分派（静态方法中，允许参数列表不同的重名方法，指静态方法之间的重载）
		
		//2.动态分派（在具有继承关系的情况下，调用实例方法时，自低向上查找可用的方法版本，指实例方法的覆盖）
		
		//方法调用指令5个
		//invokespacial 调用私有方法、构造方法
		//invokeinterface 调用接口方法
		//invokestatic 调用静态方法
		//invokevirtual 调用虚方法（父类定义的，日后被子类覆盖的方法）
		//invokedynamic 调用动态链接方法
		
		
		
		A.staticMethod();
		B.staticMethod();
	}
}


//类
class A{
	static int field;
	public static void staticMethod(){
		System.out.println("A - staticMethod() " +field);
	}
}

class B extends A{
	//@Override
	public static void staticMethod(){
		System.out.println("B - staticMethod() ");
	}
}