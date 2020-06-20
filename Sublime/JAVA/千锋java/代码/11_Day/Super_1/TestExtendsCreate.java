public class TestExtendsCreate{
	public static void main(String[] args){
		C c = new C();
		
		System.out.println(c.cField);
		System.out.println(c.bField);
		System.out.println(c.aField);
		
	}
}

class A{//extends java.lang.Object
	//2.初始化属性
	int aField = 10;
	
	public A(){
		super();//1.调用父类的无参构造方法（暂不关注）
		System.out.println("A() " + aField);//3.执行构造方法的代码
	}
}

class B extends A{
	//2.初始化属性
	int bField = 20;
	
	public B(){
		super();//1.调用父类的无参构造方法
		System.out.println("B() " + bField);//3.执行构造方法的代码
	}
}

class C extends B{
	//2.初始化属性
	int cField = 30;
	
	public C(){
		super();//1.调用父类的无参构造方法
		System.out.println("C() " + cField);//3.执行构造方法的代码
	}
}